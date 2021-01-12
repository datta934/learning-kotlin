package hackerrank

import java.util.*

// Complete the findDigits function below.
fun findDigits(n: Int): Int {
    var ndivisor = 0;
    var orgNumber = n;
    var temp = n;
    while (temp > 0) {
        var digit = temp % 10;
        temp /= 10;
        if (digit == 0) continue else if (orgNumber % digit == 0) {
            ndivisor++
        }
    }
    return ndivisor;
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val result = findDigits(n)

        println(result)
    }
}
