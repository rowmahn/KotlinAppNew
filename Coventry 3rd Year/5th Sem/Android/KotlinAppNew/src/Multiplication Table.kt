//input num using non return type function and loop display multiplication table

fun main(){
    print("Enter a num ")
    val num = readLine()!!.toInt()
    table(num)
}

fun table(num:Int){
    for ( i in 1..10){
        val res= num*i
        println("$num*$i=$res")
    }
}