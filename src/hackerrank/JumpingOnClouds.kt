import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the jumpingOnClouds function below.
fun jumpingOnClouds(n: Int, c: Array<Int>): Int {
    var jumps = 0;
    var i = 0;
    while (true) {
        if (i + 2 < n && c[i + 2] == 0) {
            i += 2;
        } else if (i + 1 < n) {
            i++;
        } else {
            break;
        }
        jumps++;
    }
    return jumps;
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val c = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = jumpingOnClouds(n, c)

    println(result)
}
