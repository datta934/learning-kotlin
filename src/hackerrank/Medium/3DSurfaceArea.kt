package hackerrank.Medium

import java.util.*

// Complete the surfaceArea function below.
fun surfaceArea(A: Array<Array<Int>>): Int {
    val H: Int = A.size
    val W: Int = A[0].size
    var result = 2 * H * W
    for (i in 0 until H) {
        for (j in 0 until W) {
            result += A[i][j] * 4
            if (i != 0) {
                result -= 2 * A[i - 1][j].coerceAtMost(A[i][j])
            }
            if (j != 0) {
                result -= 2 * A[i][j].coerceAtMost(A[i][j - 1])
            }
        }
    }
    return result

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val HW = scan.nextLine().split(" ")

    val H = HW[0].trim().toInt()

    val W = HW[1].trim().toInt()

    val A = Array<Array<Int>>(H) { Array<Int>(W) { 0 } }

    for (i in 0 until H) {
        A[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = surfaceArea(A)

    println(result)
}
