fun main(args : Array<String>){

//   NOTE:
//    kotlin.math is different from java.lang.Math

    println(kotlin.math.abs(-2))
    println(kotlin.math.PI)
    println(kotlin.math.ceil(5.6))
    println(kotlin.math.floor(5.6))
// *************   there is no pow()*******
//    use java.lang.Math
    println(java.lang.Math.pow(5.toDouble(),3.toDouble()))
//    toDouble() to satisft Kotlin...
//    I think Autoboxing is not significant in Kotlin

    println(kotlin.math.round(5.6))
    println(kotlin.math.truncate(5.6))

//    sin,cos,tan,asin,acos,atan... all are common
    println(kotlin.math.sqrt(5.6))

}