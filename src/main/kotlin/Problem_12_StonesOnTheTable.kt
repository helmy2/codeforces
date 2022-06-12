fun main() {
    readln()
    val list = readln()

    var sum = 0
    for (i in 0 until  list.length - 1) {
        if (list[i] == list[i+1])
            sum += 1
    }
    print(sum)
}