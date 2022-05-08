fun main() {
    val l = readLine()!!.toList()
    val n = l.toList().distinct().count()
    if (n.mod(2) == 0)
        print("CHAT WITH HER!")
    else
        print("IGNORE HIM!")
}