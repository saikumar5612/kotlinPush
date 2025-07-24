fun checkAnagram(s1:String, s2:String): Boolean{
    val wordOne = s1.lowercase().replace(" ", "")
    val wordTwo = s2.lowercase().replace(" ", "")

    val sortedWordOne = s1.toCharArray().sorted()
    val sortedWordTwo = s2.toCharArray().sorted()

    return sortedWordTwo == sortedWordOne
}

fun main(){
    println(checkAnagram("bob","obb"))
    println(checkAnagram("mike","mich"))
}