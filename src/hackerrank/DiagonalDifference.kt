import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*


fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var d1 = 0;
    var d2 = 0;
    for (i in  0..arr.size - 1){
        d1 += arr[i][i];
        d2 += arr[i][arr.size-i-1];
    }
    return (Math.abs(d1-d2));
}


fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
