fun main (args : Array<String>){
    // var is Mutable
    // val is Immutable

    val name = "Hari Krishna"
    var age = 19
    println("My name is "+name)
    println("My age is $age")
    // name = "RSS Hari Krishna"  //Error
    
    var bigInt : Int = Int.MAX_VALUE
    var smallInt : Int = Int.MIN_VALUE
    println("Largest Int is : "+bigInt)
    println("Smallest Int is : "+smallInt)

    var bigShort : Short = Short.MAX_VALUE
    var smallShort : Short = Short.MIN_VALUE
    println("Largest Short is : $bigShort")
    println("Smallest Short is : $smallShort")

    var bigLong : Long = Long.MAX_VALUE
    var smallLong : Long = Long.MIN_VALUE
    println("Largest Long is : $bigLong")
    println("Smallest Long is : $smallLong")

    var bigDouble : Double = Double.MAX_VALUE
    var smallDouble : Double = Double.MIN_VALUE
    println("Largest Double is : $bigDouble")
    println("Smallest Double is : $smallDouble")

    var bigFloat : Float = Float.MAX_VALUE
    var smallFloat : Float = Float.MIN_VALUE
    println("Largest Float is :$bigFloat")
    println("Smallest Float is : $smallFloat")

    if(bigDouble is Double){
        println("Yes bigDouble is Double")
    }else{
        println("No bigDouble is not Double")
    }

    // if(bigDouble is double){    is double    should not be used
    //   is Double is rightkotli
    //     println("Yes bigDouble is double")
    // }else{
    //     println("No bigDouble is not double")
    // }

    var myBool : Boolean = true
    var myBool2 = false
    if(myBool){
        println("myBool is true")
    }else{
        println("myBool is false")
    }

    if(myBool2){
        println("myBool2 is true")
    }else{
        println("myBool2 is false")
    }

    var my_Char : Char = 'a'
    println("\'a\' is a Char (true/false) : ${my_Char is Char}")
    // $ is String Interpolation
    // ${expr} interpolates the value of the expression
}