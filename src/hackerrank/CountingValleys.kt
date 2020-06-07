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
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the countingValleys function below.
fun countingValleys(n: Int, s: String): Int {
    var v = 0;
    var sealevel = 0;
    val chars : CharArray = s.toCharArray();
    for (i in chars.indices) {
        if(chars[i] == 'U'){
            ++sealevel;
        }
        if(chars[i] == 'D'){
            --sealevel;
        }
        if(sealevel == 0 && chars[i] == 'U'){
            ++v;
        }
    }
    return v;
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val result = countingValleys(n, s)

    println(result)
}
