package hackerrank

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

// Complete the hackerrank.bonAppetit function below.
fun bonAppetit(bill: Array<Int>, k: Int, b: Int) {
    var billAmount = 0;
    for (i in 0 until bill.size) {
       billAmount += bill[i];
    }
    billAmount = (billAmount - bill[k])/2;
    if(billAmount == b){
        println("Bon Appetit");
    }else {
        println(b-billAmount);
    }

}

fun main(args: Array<String>) {
    val nk = readLine()!!.trimEnd().split(" ")

    val n = nk[0].toInt()

    val k = nk[1].toInt()

    val bill = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trim().toInt()

    bonAppetit(bill, k, b)
}
