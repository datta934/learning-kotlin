package hackerrank

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

// Complete the dayOfProgrammer function below.
//31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 = 243 |  256-243 = 13
fun dayOfProgrammer(year: Int): String {
    var result = "";
    if (year in 1700..1917) {
        result = if(year%4 ==0){
            "12.09.$year";
        }else{
            "13.09.$year";
        }
    }else{
        // February 14th was the 32nd day of the year in Russia. 256-243 = 13+ 13
        result = if(year==1918){
            "26.09.$year";
        }else{
            if(year%400==0){
                "12.09.$year";
            } else if(year%4==0 && year%100!=0){
                "12.09.$year";
            } else{
                "13.09.$year";
            }
        }
    }
    return result;
}


fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}
