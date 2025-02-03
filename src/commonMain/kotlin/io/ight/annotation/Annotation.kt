package io.ight.annotation


@DslMarker
@SinceIght("0.0.3")
annotation class Ight {


    @DslMarker
    @SinceIght("0.0.3")
    annotation class DSL

    @DslMarker
    @SinceIght("0.0.3")
    annotation class Action

    @DslMarker
    @SinceIght("0.0.3")
    annotation class State

    @DslMarker
    @SinceIght("0.0.3")
    annotation class SideEffect

    @DslMarker
    @SinceIght("0.0.3")
    annotation class UIComponent


    @DslMarker
    @SinceIght("0.0.3")
    annotation class Dispatcher


    @DslMarker
    @SinceIght("0.0.3")
    annotation class DataSource


    @DslMarker
    @SinceIght("0.0.3")
    annotation class DTO


    @DslMarker
    @SinceIght("0.0.3")
    annotation class Route


    @DslMarker
    @SinceIght("0.0.3")
    annotation class Feature


    @DslMarker
    @SinceIght("0.0.3")
    annotation class Application

}


/**
 *
 */
@Ight
@Retention(AnnotationRetention.BINARY)
@MustBeDocumented
annotation class SinceIght(val version : String)


/**
 *
 */
@Ight
@SinceIght("0.0.3")
@MustBeDocumented
annotation class DeprecatedIght(
    val message : String ,
    val replaceWith : ReplaceWith = ReplaceWith("") ,
    val level : DeprecationLevel = DeprecationLevel.WARNING ,
)


/**
 *
 */
@Ight
@SinceIght("0.0.3")
@MustBeDocumented
annotation class DeprecatedSinceIght(
    val warningSince : String = "" ,
    val errorSince : String = "" ,
    val hiddenSince : String = "" ,
)


/**
 *
 */
@Ight
@DslMarker
@SinceIght("0.0.3")
annotation class ExperimentalIghtApi(
    val message : String ,
    val level : DeprecationLevel = DeprecationLevel.WARNING ,
)


/**
 *
 */
@Ight
@DslMarker
@SinceIght("0.0.3")
annotation class WeDontDoThisAnymore(
    val message : String ,
    val replaceWith : ReplaceWith = ReplaceWith("") ,
    val level : DeprecationLevel = DeprecationLevel.ERROR ,
)
