// John works at a clothing store. He has a large pile of socks that he must pair by color for sale.
// Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
// Function Description
// Complete the sockMerchant function in the editor below.
// It must return an integer representing the number of matching pairs of socks that are available.
//Sample Input:
//9
//10 20 20 10 10 30 50 10 20
//Sample Output
//3
// sockMerchant has the following parameter(s):
//
//n: the number of socks in the pile
//ar: the colors of each sock
import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var count = 0;
    ar.sort();
    var i = 0;
    while (i < ar.size-1) {
        if(ar[i] == ar[i+1]){
            count++;
            i = i+2;
        }
        else{
            i++;
        }
    }
    return count;
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
