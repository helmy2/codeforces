import java.util.Scanner

//https://codeforces.com/contest/791/problem/A?f0a28=1

fun main() {
    val scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    var b = scanner.nextInt()

    var n = 0
    while (true) {
        if (a > b)
            break
        a *= 3
        b *= 2
        n++
    }
    print(n)
}