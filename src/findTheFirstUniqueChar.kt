
fun findFirstUniqueChar(input: String): Char? {

    val lowerInput = input.lowercase()


    val charCountMap = linkedMapOf<Char, Int>()


    for (char in lowerInput) {
        charCountMap[char] = charCountMap.getOrDefault(char, 0) + 1
    }


    for ((char, count) in charCountMap) {
        if (count == 1) return char
    }


    return null
}

fun main() {
    val result1 = findFirstUniqueChar("kotlin")
    println("First unique char: $result1")

    val result2 = findFirstUniqueChar("racecar")
    println("First unique char: $result2")

    val result3 = findFirstUniqueChar("aabbcc")
    println("First unique char: $result3")
}
