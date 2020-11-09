fun main () {
    print ("Enter fist num")
    val a = readLine()!!.toInt()
    print("Enter second num")
    val b = readLine()!!.toInt()
    val c = add(b = b,a = a)

    //String Interpolation
    println("Sum of $a and $b is $c")

}

//fun add(a: Int = 0, b:Int=0):Int{
 //   return a+ b
//}