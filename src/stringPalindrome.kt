import java.io.DataInput

fun checkIfStringPalindrome(input: String):Boolean{
    val lower = input.lowercase().replace(" ","")
    val reversed = lower.reversed()
    return lower == reversed


}

fun main(){
    println(checkIfStringPalindrome("Racecar"))
    println(checkIfStringPalindrome("low"))
}