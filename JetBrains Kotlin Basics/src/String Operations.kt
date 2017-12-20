import java.util.Scanner

fun main(args : Array<String>){
    var s = Scanner(System.`in`)
    println("Enter a String")
    var myString : String = s.nextLine()
    println("Length of $myString is ${myString.length}")
    println("The first Character is ${myString.get(0)}")
//    subSequence(startIndex , endIndex)
    println("A substring of $myString is ${myString.subSequence(1,myString.length)}")

//    compareTo : Int
    println("Comapring $myString with \"Hello\"");
    println(myString.compareTo("Hello"))

    println("Comapring $myString with $myString");
    println(myString.compareTo(myString))

//    drop => Returns a String with first n characters removed
    println("Enter a Number to get a String with that many characters removed")
    println("As this is a demo...Enter a valid value")
    var n : Int = 0
    n = s.nextInt()
    print(myString.drop(n))

    println("The UpperCase version of $myString is ${myString.toUpperCase()}")
    println("The LowerCase version of $myString is ${myString.toLowerCase()}")


//    padEnd(length:Int , padChar:Char)
    println("Padding End $myString with \'#\' for len = 3 is ${myString.padEnd(3,'#')}")

//    padStart(length : Int , padChar:Char)
    println("Padding Start $myString with \'#\' for len = 3 is ${myString.padStart(3,'#')}")

//    plus OPERATOR ===> Concatenation
    println("Hello ".plus(myString))


//    indexOf(ch:Char , startIndex:Int , ignoreCase:Boolean = false) : Int
    println("indexOf(\'h\',1,false) => ${myString.indexOf('h',0,false)}")

//    CharSequence.last() returns last element
    println("$myString.last() : "+myString.last())

//    reversed()
    println("Reverse of $myString is ${myString.reversed()}")


//    substring(start:Int , end : Int) : String
    println("substring(2,4)  : ${myString.substring(2,4)}")

    println("Enter an Int which will be read as String")
    var value : String = s.nextLine()

//    println("toInt() : "+value.toInt())
//    println("toDouble() : ${value.toDouble()}")
    println("toIntOrNull() : ${value.toIntOrNull(

    )}")
    println("toDoubleOrNull() : ${value.toDoubleOrNull()}")

//    Returns true if the String contains the word "true" else false
    println("$myString .toBoolean() : ${myString.toBoolean()}")
    println("toBigIntegerOrNull() : ${value.toBigIntegerOrNull()}")
    println("toFloatOrNull() : ${value.toFloatOrNull()}")

}