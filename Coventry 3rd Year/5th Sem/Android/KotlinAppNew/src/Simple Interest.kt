fun main (){
    print("Enter principle")
    val P = readLine()!!.toFloat()
    print("Enter Time")
    val T = readLine()!!.toFloat()
    print("Enter Rate")
    val R = readLine()!!.toFloat()

    val S= SI(P,T,R)
    print("Simple Interest is :" + S)

}

fun SI(P: Float, T:Float,R: Float ): Float{
    return (P*T*R)/100
}