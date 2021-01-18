package hackerrank

import jdk.vm.ci.code.CodeUtil.M
import java.util.*
import javax.swing.text.html.HTML.Attribute.N


// Complete the chocolateFeast function below.
fun chocolateFeast(n: Int, c: Int, m: Int): Int {
    var result = 0;
    var bought = n / c;
    result += bought;

    var wrappers = bought;
    while (wrappers >= m) {
        val chocolates = wrappers / m;
        result += chocolates;
        wrappers = wrappers - chocolates * m + chocolates;
    }
    return result;

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val ncm = scan.nextLine().split(" ")

        val n = ncm[0].trim().toInt()

        val c = ncm[1].trim().toInt()

        val m = ncm[2].trim().toInt()

        val result = chocolateFeast(n, c, m)

        println(result)
    }
}
