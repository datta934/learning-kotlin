package hackerrank

import java.util.*

// Complete the designerPdfViewer function below.
fun designerPdfViewer(h: Array<Int>, word: String): Int {
    var maxHeight = 0;
    var area=0;
    var N= word.length;
    for(i in 0 until N){
        val tempChar: Char = word[i];
        maxHeight = if (maxHeight < h[tempChar.toInt() - 97]) h[tempChar.toInt() - 97] else maxHeight
    }
    area = N * maxHeight;
    return area;
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val h = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val word = scan.nextLine()

    val result = designerPdfViewer(h, word)

    println(result)
}
