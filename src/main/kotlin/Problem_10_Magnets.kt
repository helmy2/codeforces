fun main() {
    val n = readLine()!!.toInt()
    val list = mutableListOf<String>()
    repeat(n) {
        list += readLine()!!
    }
    var numberOfGroups = 1
    var isGroup = false
    for (i in 0 until list.size - 1) {
        if (list[i][1] == list[i + 1][0])
            isGroup = true
        if (isGroup) {
            isGroup = false
            numberOfGroups += 1
        }
    }
    print(numberOfGroups)
}