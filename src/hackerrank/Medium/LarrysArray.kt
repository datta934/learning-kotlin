package hackerrank.Medium

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.math.sign
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the larrysArray function below.
fun larrysArray(A: Array<Int>): String {
    var inversion = 0;
    var arrayL = A.size;
    for (i in 0 until arrayL) {
        for (j in i + 1 until arrayL) {
            if (A[i] > A[j]) {
                inversion++;
            }
        }
    }
    if (inversion % 2 == 0) {
        return "YES";
    } else {
        return "NO";
    }

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val A = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

        val result = larrysArray(A)

        println(result)
    }
}
