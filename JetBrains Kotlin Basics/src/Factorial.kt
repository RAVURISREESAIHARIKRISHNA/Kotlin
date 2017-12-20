import java.util.Scanner

fun factorial(n : Int):Double{
    if(n<=0){
        return 0.toDouble()
    }
    if(n==1){
        return 1.toDouble()
    }else{
        return n * factorial(n-1)
    }
}

fun main(args : Array<String>) {
    println("Enter a Number")
    var s = Scanner(System.`in`)

    var n : Int = s.nextInt()
    println("The Factorial of $n is ${factorial(n)}")
}