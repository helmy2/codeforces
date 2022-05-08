fun main() {
    val l1 = readLine()!!.lowercase()
    val l2 = readLine()!!.lowercase()

    if (l1 > l2)
        print(1)
    else if (l1 < l2)
        print(-1)
    else
        print(0)
}
