import java.util.Scanner

//https://codeforces.com/contest/231/problem/A
fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    var numberOfProblem = 0
    repeat(n){
        val list = mutableListOf<Int>()
        repeat(3){
            list += scanner.nextInt()
        }
        if (list.count { it == 1 } > 1)
            numberOfProblem += 1
    }
    print(numberOfProblem)
}