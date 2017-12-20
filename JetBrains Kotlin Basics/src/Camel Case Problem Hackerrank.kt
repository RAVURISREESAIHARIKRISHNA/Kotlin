//  https://www.hackerrank.com/challenges/camelcase/problem

//JAVA Solution @  https://github.com/RAVURISREESAIHARIKRISHNA/Hackerrank/blob/master/Algorithms/Strings/CamleCase/Solution.java

import java.util.Scanner

fun main(args : Array<String>){
    var s = Scanner(System.`in`)
    var raw : String
    raw = s.nextLine()
    var count : Int = 0
    for(ch : Char in raw){
        if(ch>='A' && ch<='Z')
            count++
    }
    count++
    println(count)
}