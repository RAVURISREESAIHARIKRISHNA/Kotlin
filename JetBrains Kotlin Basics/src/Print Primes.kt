import java.util.Scanner

fun isPrime(src:Int):Boolean{
    var i :Int = 2
    while(i<=src-1){
        if(src%i==0)
            return false
        i++
    }
    return true
}

fun main(args : Array<String>){
    var s = Scanner(System.`in`)
    println("Enter a Number to print all the primes from 2 to that number")
    var range : Int = s.nextInt()
    var i : Int = 2
    while(i<=range){
        if(isPrime(i))
            println(i)
        i++
    }
}