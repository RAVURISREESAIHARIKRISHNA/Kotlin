fun main (args : Array<String>){
    var fName : String = "Hari";
    var lName = "Krishna";
    val my_Name = fName + " " + lName
    
    var str1 = "String1"
    var str2 = "String2"
    var dummy = "String1"

    println("str1 equals str2 ${str1.equals(str2)}")
    println("str1 compareTo str2 ${str1.compareTo(str2)}")
    println("Length of str1 : ${str1.length}")

    // charAt()
    str1 = "abcdef"
    println("ChartAt index 2 is ${str1.get(2)}")
    println("CharAt index 2 is ${str1[2]}")


    // substring ==> subSequence(start,end+1)..u know what i mean..same Java
    println("\"abcdefghi\" subSequence(2,6) is ${"abcdefghi".subSequence(2,6)}")

    // contains() same Java
    println("\"abcdefghi\" contains(\"bcd\") : ${"abcdefghi".contains("bcd")}")



}