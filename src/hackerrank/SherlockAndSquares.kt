package hackerrank

import java.util.*
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.sqrt

// Complete the squares function below.
fun squares(a: Int, b: Int): Int {
    val numSquares = (floor(sqrt(b.toDouble())) - ceil(sqrt(a.toDouble())) + 1).toInt();

    return numSquares;
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val ab = scan.nextLine().split(" ")

        val a = ab[0].trim().toInt()

        val b = ab[1].trim().toInt()

        val result = squares(a, b)

        println(result)
    }
}
