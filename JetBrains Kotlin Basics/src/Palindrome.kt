import java.util.Scanner

fun main(args : Array<String>){
    var s = Scanner(System.`in`)
    println("Enter a String")
    var myString : String = s.nextLine()
    var stringBuilder = StringBuilder(myString)
    if(myString.equals(stringBuilder.reverse().toString())){
        println("Yes...$myString is a Palindrome")
    }else{
        println("No....$myString is not a palindrome")
    }
}