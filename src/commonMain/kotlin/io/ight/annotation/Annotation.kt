package io.ight.annotation


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
@SinceIght("0.0.1")
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
@SinceIght("0.0.1")
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
@SinceIght("0.0.1")
annotation class ExperimentalIghtApi(
    val message : String ,
    val level : DeprecationLevel = DeprecationLevel.WARNING ,
)


/**
 *
 */
@DslMarker
@SinceIght("0.0.1")
annotation class RemoveIt(
    val message : String ,
    val replaceWith : ReplaceWith = ReplaceWith("") ,
    val level : DeprecationLevel = DeprecationLevel.ERROR ,
)
