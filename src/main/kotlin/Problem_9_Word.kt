fun main() {
    var word = readLine()!!
    val uppercaseNumber = word.count { it.isUpperCase() }
    val lowercaseNumber = word.count { it.isLowerCase() }
    word = if (lowercaseNumber >= uppercaseNumber)
        word.lowercase()
    else
        word.uppercase()
    print(word)
}