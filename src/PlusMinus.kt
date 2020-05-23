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

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {
    var posArr: MutableList<Int> = mutableListOf<Int>()
    var negArr: MutableList<Int> = mutableListOf<Int>()
    var zeroArr: MutableList<Int> = mutableListOf<Int>()
    for (p in arr.indices){
        if(arr[p]>0){
            posArr.add(arr[p]);
        }
        else if(arr[p]<0){
            negArr.add(arr[p]);
        }
        else if(arr[p] == 0 ){
            zeroArr.add(arr[p]);
        }

    }
    println("%.6f".format((posArr.size.toDouble())/arr.size));
    println("%.6f".format((negArr.size.toDouble())/arr.size));
    println("%.6f".format((zeroArr.size.toDouble())/arr.size));
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
