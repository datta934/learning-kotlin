package hackerrank

import java.util.*
import kotlin.collections.*
import kotlin.math.abs

// Complete the minimumDistances function below.
fun minimumDistances(a: Array<Int>): Int {
    var occArr: ArrayList<Int> = ArrayList();
    var minNum = 0;
    for (i in 0 until a.size - 1) {
        for (j in i + 1 until a.size) {
            if (a[i] == a[j]) {//
                var d = abs(i - j);
                occArr.add(d);
            }
        }
    }
    minNum = if(occArr.isNullOrEmpty()){
        -1;
    }else{
        occArr.min()!!;
    }

    return minNum;
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = minimumDistances(a)

    println(result)
}
