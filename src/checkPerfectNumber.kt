import java.io.DataInput

fun checkIfPerfectNumb(input: Int):Boolean{
    var sumOfDivi = 0
    for (i in 1 until input){
        if (input % i==0){
            sumOfDivi +=i
        }
    }
    return sumOfDivi == input
}

fun main(){

    println(checkIfPerfectNumb(6))
    println(checkIfPerfectNumb(7))
}