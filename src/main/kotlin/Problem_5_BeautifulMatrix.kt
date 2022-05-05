import java.util.Scanner
import kotlin.math.abs

//https://codeforces.com/contest/263/problem/A
fun main() {
    val scanner = Scanner(System.`in`)
    val array = Array(5) {
        Array(5) {
            scanner.nextInt()
        }
    }

    var index = Pair(0, 0)
    for (i in 0..4)
        for (j in 0..4)
            if (array[i][j] == 1)
                index = Pair(i,j)

    val n = abs(index.first - 2) + abs(index.second - 2)
    print(n)


}