import java.util.*

//https://codeforces.com/contest/734/problem/A

fun main() {
    val scanner = Scanner(System.`in`)
    scanner.nextInt()
    val list = scanner.next()

    val antonNumber =  list.count { it == 'A' }
    val danikNumber =  list.count { it == 'D' }

    if (antonNumber > danikNumber)
        print("Anton")
    else if (antonNumber < danikNumber)
        print("Danik")
    else
        print("Friendship")
}