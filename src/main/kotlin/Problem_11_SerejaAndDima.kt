fun main() {
    val n = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }.toMutableList()
    var x = 0
    var y = 0

    for (i in 0 until n) {
        if (i % 2 == 0) {
            if (list.first() > list.last()) {
                x += list.first()
                list.removeFirst()
            } else {
                x += list.last()
                list.removeLast()
            }
        } else {
            if (list.first() > list.last()) {
                y += list.first()
                list.removeFirst()
            } else {
                y += list.last()
                list.removeLast()
            }
        }
    }
    print("$x $y")
}