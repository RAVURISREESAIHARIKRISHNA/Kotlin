import java.util.Scanner

//Euclidians Extended algorithm for GCD

//GCD of a number will not change if we
//subtract the small number from the large number

//so we can continuously subtract the small number from
//the big number

//Alternativiely....We can divide the SMall number with Large number

fun gcd(a:Int , b:Int):Int{
    if(a==0){
        return b
    }
    return gcd(b%a , a)  // I assumed that b is small...
//    If you assume that a is small then
//    return gcd(a%b,b)
}


fun main(args: Array<String>){
    println("Enter a for gcd(a,b)...")
    var s = Scanner(System.`in`)
    var a : Int = s.nextInt()
    if(a<0){
        println("Should not be negative")
        System.exit(0)
    }
    println("Enter b for gcd(a,b)...")
    var b :Int = s.nextInt()
    if(b<0){
        println("Should not be negative")
        System.exit(0)
    }
    println("gcd($a,$b) is ${gcd(a,b)}")
}


//TIME COMPLEXITY : O(log( min(a,b) ))
//SPACE COMPLEXITY : O(1)