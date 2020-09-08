import java.util.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

fun repeatedString(s: String, n: Long): Long {
    var count:Long = 0;
    for (i in 0 until s.length) if (s.get(i) === 'a') count++
    val repititions: Long = n / s.length
    count = (count * repititions)

    for (i in 0 until n % s.length) {
        if (s.get(i.toInt()) === 'a') count++
    }

    return count.toLong()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val n = scan.nextLine().trim().toLong()

    val result = repeatedString(s, n)

    println(result)
}
