fun main() {
    readln()
    val list = readln().split(" ").map { it.toInt() }

    var output = 0
    var place = 0
    list.forEach {
        if (it != -1)
            place += it
        else
            if (place != 0)
                place -= 1
            else
                output += 1
    }
    print(output)
}