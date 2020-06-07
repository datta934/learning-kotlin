import  java.util.Scanner
import kotlin.math.min

fun miniMaxSum(arr: Array<Int>): LongArray {
    val minmax = longArrayOf(0, 0)
    arr.sort();
    for(i in 0 until arr.size-1){
        minmax[0] = minmax[0] + arr[i]
    }
    for(j in 1 until arr.size){;
        minmax[1] = minmax[1]+ arr[j];
    }
    return (minmax);
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = miniMaxSum(arr)

    println(result.joinToString(" "))
}