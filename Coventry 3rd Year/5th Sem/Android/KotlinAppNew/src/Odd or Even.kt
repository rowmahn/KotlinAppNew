fun main() {
    print("Enter a number")
    val num = readLine()!!.toInt()
    val OE = checkOddEven(num)
    print("$num is $OE")
}

fun checkOddEven(num: Int): String {
    val OE: String
    if (num % 2 == 0) {
        OE = "Even"
    } else {
        OE = "Odd"
    }
    return OE
}
