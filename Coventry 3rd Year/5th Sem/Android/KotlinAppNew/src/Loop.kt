fun main(){
    for (i in 1..10){
        println("i is $i")
    }

    for (i in 1..10 step 2){ //for(i=1;i<=10;i+=2)
        println("i is $i")
    }
    for (i in 1 until 11) //for(i=1;i<11)
    {
        println("i is $i")
    }
    for (i in 10 downTo  1)
    {
        println("i is $i")
    }

}