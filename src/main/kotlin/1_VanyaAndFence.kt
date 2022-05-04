import java.util.*
import kotlin.math.ceil

//https://codeforces.com/contest/677/problem/A

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val h = scanner.nextInt()
    val list = mutableListOf<Int>()
    repeat(n) {
        list += scanner.nextInt()
    }

    var width = 0
    list.forEach {
        width += ceil(it.toFloat() / h).toInt()
    }

    println(width)

}