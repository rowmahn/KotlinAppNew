fun main(){
    print("Enter a character")
    val char = readLine()!![0]
    //checkVowel(char)
    checkVowelUsingWhen(char)
}

fun checkVowel(char:Char){
    if (char == 'a' || char == 'e' ||char == 'i' ||char == 'o' ||char == 'u' )
    {
        print("Vowel")
    }
    else
        print("Consonant")
}

fun checkVowelUsingWhen (char: Char){
    when (char){
        'a','e','i','o','u'->
            println("Vowel")
        else->
            print("Consonant")
    }
}