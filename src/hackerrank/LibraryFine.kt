package hackerrank

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
import kotlin.math.abs
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the libraryFine function below.
fun libraryFine(d1: Int, m1: Int, y1: Int, d2: Int, m2: Int, y2: Int): Int {
    var fineAmt = 0;
    fineAmt = if ((d2 >= d1 && m2 >= m1 && y2 >= y1) || (m2 > m1 && y2 >= y1) || (y2 > y1)) {
        0;
    } else if (d2 < d1 && m2 == m1 && y2 >= y1) {
        15 * abs(d2 - d1)
    } else if (m2 < m1 && y2 == y1) {
        500 * abs(m2 - m1)
    } else {
        10000;
    }
    return fineAmt;
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val d1M1Y1 = scan.nextLine().split(" ")

    val d1 = d1M1Y1[0].trim().toInt()

    val m1 = d1M1Y1[1].trim().toInt()

    val y1 = d1M1Y1[2].trim().toInt()

    val d2M2Y2 = scan.nextLine().split(" ")

    val d2 = d2M2Y2[0].trim().toInt()

    val m2 = d2M2Y2[1].trim().toInt()

    val y2 = d2M2Y2[2].trim().toInt()

    val result = libraryFine(d1, m1, y1, d2, m2, y2)

    println(result)
}
