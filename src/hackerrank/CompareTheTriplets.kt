import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the compareTriplets function below.
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    val scores = arrayOf(0, 0);
    for (i in a.indices) {
        if (a[i] > b[i]) {
            scores[0] = scores[0] + 1;
        } else if (a[i] < b[i]) {
            scores[1] = scores[1] + 1;
        }

    }
    return (scores);

}

fun main(args: Array<String>) {
    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
