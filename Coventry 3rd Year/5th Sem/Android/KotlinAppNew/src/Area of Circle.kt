
fun main(){
    print("Enter radius of circle")
    val r = readLine()!!.toFloat()
    val a = Area(_r=r)
    print("Area is $a")
}

fun Area(pi : Float=3.14F,_r: Float) : Float{
    return pi*_r*_r
}