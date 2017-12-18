fun main (args : Array<String>){
    // Array Creation using arrayOf()
    // This is pretty much Object arr[]
    var my_arr = arrayOf(1 , 3.12345 , "Hello World", 'a')
    println(my_arr[0])
    println(my_arr[1])
    println(my_arr[2])
    println(my_arr[3])

    // Array Size   arr.size
    println("Size of my_arr is : ${my_arr.size}")

    // contains
    // JAVA 8.0 +
    // int a[] = {1,2,3,4};
    // boolean contains = InStream.of(a).anyMatch(x -> x==4);
    
    println("my_arr contains \"Hello World\" : ${my_arr.contains("Hello World")}")

    // copyOfRange()
    // In JAVA 5.0 +
    // java.util.Arrays.copyOfRange(srcArray , start , end+1)
    var subArray = my_arr.copyOfRange(1,3);
    println("subArray.size : ${subArray.size}")
    println(subArray[0])
    println(subArray[1])

    // indexOf()
    println("my_array.indexOf(1) : ${my_arr.indexOf(1)}")

    // first()
    println("my_array.first() : ${my_arr.first()}")

    // last()
    println("my_array.last() : ${my_arr.last()}")
    

    var arra = Array(5,{x -> x*x})

    println(arra[2])
    
}