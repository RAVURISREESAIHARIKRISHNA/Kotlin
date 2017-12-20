
fun main(args : Array<String>){
//    var is mutable
    var a = 4
    var b : Int
//    b = "Hello" Error


//    val is Immutable...like final in Java
    val c : Double = 8.9
//    c = 9.0 Error

//    BASIC DATA TYPES

//    Int
    var d : Int
    println("The largest Int value is ${Int.MAX_VALUE}")
    println("The smallest Int value is ${Int.MIN_VALUE}")

//    Double
    var e : Double
    println("The largest Double value is ${Double.MAX_VALUE}")
    println("The smallest Double value is ${Double.MIN_VALUE}")

//    Float
    var f : Float
    println("The largest Float value is ${Float.MAX_VALUE}")
    println("The smallest Float Value is ${Float.MIN_VALUE}")

//    Long
    var g : Long
    println("The largest Long value is ${Long.MAX_VALUE}")
    println("The smallest Long Value is ${Long.MIN_VALUE}")

//    Short
    var h : Short
    println("The largest Short value is ${Short.MAX_VALUE}")
    println("The smallest Short value is ${Short.MIN_VALUE}")

//  Char
    var j : Char
    j = 'a'
    println("The ASCII Value of $j is "+j.toInt())

//    Boolean
    var i : Boolean
    i = true


}