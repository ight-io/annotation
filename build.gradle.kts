import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

plugins {
    alias(ight.plugins.kotlinMultiplatform)
    alias(ight.plugins.androidLibrary)
    alias(ight.plugins.kotlinPluginSerialization)
    alias(ight.plugins.vanniktech.maven.publish)
}

kotlin {

    applyDefaultHierarchyTemplate()

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        moduleName = "io.ight.annotation.wasm"
        browser {
            commonWebpackConfig {
                outputFileName = "annotation.js"
                devServer = (devServer ?: KotlinWebpackConfig.DevServer()).apply {
                    static = (static ?: mutableListOf()).apply {
                        // Serve sources to debug inside browser
                        add(project.rootDir.path)
                        add(project.projectDir.path)
                    }
                }
            }
        }
    }

    androidTarget {
        publishLibraryVariants("release")
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget = JvmTarget.JVM_17
        }
    }

    iosArm64()
    macosArm64()
    iosSimulatorArm64()
    linuxX64()
    jvm()


    sourceSets {

        commonMain.dependencies {
            implementation(ight.kotlinx.serialization.json)
        }

        commonTest.dependencies {
            implementation(ight.kotlin.test)
        }


        all {
            languageSettings {
                languageVersion = "2.0"
            }
        }

    }
}


android {
    namespace = "io.ight.annotation.android"
    compileSdk = ight.versions.android.compileSdk.get().toInt()
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    defaultConfig {
        minSdk = ight.versions.android.minSdk.get().toInt()
    }
}
