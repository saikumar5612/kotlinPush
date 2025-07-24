import java.io.DataInput

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun checkIfNumberPrime(input: Int):Boolean{
    if (input<=1) return false
    for (i in 2 until input){
        if (input % 2 == 0) return false
    }
    return true
}
fun main() {
    println(checkIfNumberPrime(5))
    println(checkIfNumberPrime(2))
    println(checkIfNumberPrime(10))
}