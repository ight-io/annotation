package io.ight.annotation


@DslMarker
@Target(AnnotationTarget.CLASS , AnnotationTarget.ANNOTATION_CLASS)
@Retention(AnnotationRetention.BINARY)
annotation class Ight {


    @DslMarker
    @SinceIght("0.0.1")
    @Target(
        AnnotationTarget.CLASS ,
        AnnotationTarget.TYPE_PARAMETER ,
        AnnotationTarget.PROPERTY ,
        AnnotationTarget.FIELD ,
        AnnotationTarget.LOCAL_VARIABLE ,
        AnnotationTarget.VALUE_PARAMETER ,
        AnnotationTarget.CONSTRUCTOR ,
        AnnotationTarget.FUNCTION ,
        AnnotationTarget.PROPERTY_GETTER ,
        AnnotationTarget.PROPERTY_SETTER ,
        AnnotationTarget.TYPE ,
        AnnotationTarget.FILE ,
        AnnotationTarget.TYPEALIAS ,
    )
    annotation class DSL


}