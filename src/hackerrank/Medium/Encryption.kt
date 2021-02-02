package hackerrank.Medium

import java.util.*
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.round
import kotlin.math.sqrt

// Complete the encryption function below.
fun encryption(s: String): String {
    var sentence = s.replace("\\s".toRegex(), "")
    var rows = ceil(sqrt(sentence.length.toDouble()));
    var count = 0;
    var characters = s.toCharArray();
    var newSentence = ""
    for (i in 0 until rows.toInt()) {
        var j = i;
        while (j < s.length) {
            newSentence += characters[j];
            j += rows.toInt();
            count++;
        }
        newSentence += " "
    }

    return newSentence;
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = encryption(s)

    println(result)
}
