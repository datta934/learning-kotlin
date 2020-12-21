package hackerrank

import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*
import kotlin.math.min

/*
 * Complete the pageCount function below.
 */
fun pageCount(n: Int, p: Int): Int {
    var res = min(p/2, n/2-p/2);
    return res;
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val p = scan.nextLine().trim().toInt()

    val result = pageCount(n, p)

    println(result)
}
