fun main() {
    val n = readInt()
    val l = readInts()
    val str = l.sorted().joinToString(" ") { "$it" }
    print(str)
}

private fun readInt() = readLine()!!.toInt()
private fun readInts() = readLine()!!.split(" ").map { it.toInt() }

