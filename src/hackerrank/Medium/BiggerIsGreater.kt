package hackerrank.Medium

import java.util.*


// Complete the biggerIsGreater function below.
fun biggerIsGreater(w: String): String {
    val charArray = w.toCharArray()
    val n = charArray.size;
    var endIndex = 0;
    run {
        endIndex = n - 1
        while (endIndex > 0) {
            if (charArray[endIndex] > charArray[endIndex - 1]) {
                break
            }
            endIndex--
        }
    }
    if (endIndex == 0) {
        return "no answer"
    } else {
        val firstSmallChar = charArray[endIndex - 1].toInt()
        var nextSmallChar = endIndex

        for (startIndex in endIndex + 1 until n) {
            if (charArray[startIndex] > firstSmallChar.toChar() && charArray[startIndex] < charArray[nextSmallChar]) {
                nextSmallChar = startIndex
            }
        }

        swap(charArray, endIndex - 1, nextSmallChar)

        Arrays.sort(charArray, endIndex, n)
    }
    return String(charArray)
}
fun swap(charArray: CharArray, i: Int, j: Int) {
    val temp = charArray[i]
    charArray[i] = charArray[j]
    charArray[j] = temp
}
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val T = scan.nextLine().trim().toInt()
    for (TItr in 1 until T+1) {
        val w = scan.nextLine()
        val result = biggerIsGreater(w)

        println(result)
    }
}
