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

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {
    var result = Array<Int>(2, { 0 });
    var maxScore = scores[0];
    var minScore = scores[0];
    var highCounter = 0;
    var lowCounter =0;

    for(n in 1 until scores.size){
        if(scores[n]>= maxScore){
            if(scores[n]>maxScore){
                highCounter++;
            };
            maxScore = scores[n];
        }else if(scores[n]<= minScore){
            if(scores[n]<minScore) {
                lowCounter++;
            }
            minScore = scores[n];
        }
    }
    result[0] = highCounter;
    result[1] = lowCounter;

  return result;
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
