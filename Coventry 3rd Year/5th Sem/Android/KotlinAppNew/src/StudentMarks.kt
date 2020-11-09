//dvsdvsd
fun main() {
    print("Enter marks in IOT")
    val i = readLine()!!.toFloat()
    print("Enter marks in Android")
    val a = readLine()!!.toFloat()
    print("Enter marks in WEBAPI")
    val w = readLine()!!.toFloat()
    val percent = ((i + a + w) / 300) * 100
    div(percent)

}

fun div(percent: Float) {
    if (percent >= 0 || percent <= 39) {
        print("Fail")
    } else if (percent >= 40 || percent <= 49) {
        print("3rd Div")
    } else if (percent >= 50 || percent <= 59) {
        print("2nd Div")
    } else {
        print("1st Div")
    }
}