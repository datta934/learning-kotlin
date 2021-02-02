package hackerrank.Medium

import java.util.*

// Complete the activityNotifications function below.
fun activityNotifications(expenditure: Array<Int>, d: Int): Int {
    val count = IntArray(201)
    var result = 0
    for (i in 0 until d) {
        count[expenditure[i]]++
    }
    for (i in d until expenditure.size) {
        val median = getMedian(count, d)
        if (median <= expenditure[i]) {
            result++
        }
        count[expenditure[i - d]]--
        count[expenditure[i]]++
    }
    return result
}

fun getMedian(count: IntArray, d: Int): Int {
    var sum = 0
    for (i in count.indices) {
        sum += count[i]
        if (2 * sum == d) {
            return 2 * i + 1
        } else if (2 * sum > d) {
            return i * 2
        }
    }
    return 1
}
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nd = scan.nextLine().split(" ")

    val n = nd[0].trim().toInt()

    val d = nd[1].trim().toInt()

    val expenditure = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = activityNotifications(expenditure, d)

    println(result)
}
