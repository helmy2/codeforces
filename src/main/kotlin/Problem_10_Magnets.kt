fun main() {
    val n = readLine()!!.toInt()
    var a: String
    var b = "  "
    var c = 1
    repeat(n) {
        a = readLine()!!
        if (a[1] == b[0]) c += 1
        b = a
    }
    print(c)
}