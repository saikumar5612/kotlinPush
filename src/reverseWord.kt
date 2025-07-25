import java.io.DataInput

fun reverseWords(input: String):String {
    val words = input.split(" ")
    val reversedWords = words.reversed()

    return reversedWords.joinToString(" ")
}

fun main(){
    println(reverseWords("bob is not miche"))
    println(reverseWords("miche is not bob"))
}