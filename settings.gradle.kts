pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }

    versionCatalogs {
        create("ight") {
            from("io.ight:catalog:0.0.6")
        }
    }
}

rootProject.name = "ight-annotations"
