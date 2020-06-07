import  java.util.Scanner;

// Complete the birthdayCakeCandles function below.
fun birthdayCakeCandles(ar: Array<Int>): Int {
    ar.sort();
    val max = ar[ar.size-1];
    var count = 0;
    for (i in ar.indices) {
        if(ar[i] == max){
            count++;
        }
    }
   return count;
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = birthdayCakeCandles(ar)

    println(result)
}