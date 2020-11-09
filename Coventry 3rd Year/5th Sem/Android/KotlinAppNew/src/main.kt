//Entry point of program
fun main() {
    //print("Hello World")

    val a: Int
    val b: Int
    val c: Int
    a = 3
    b = 2
    //val a =3
    //val b = 2
    c = a + b
    // print ("Sum is : "+ c)

    //Taking input from users
    print ("Enter num1 ")
    val num1 = readLine()!!.toInt()
    print ("Enter num2")
    val num2 = readLine()!!.toInt()

    //String Interpolation
    print("Sum of $a and $b is $c")


}

    //Function with return type
fun add(a: Int, b: Int) : Int{
        return a+b
    }

// Function with no return type
fun addAnother (a: Int, b:Int){
    val c = a+b
    println ("Sum of $a and $b is $c")
}
