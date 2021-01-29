package hackerrank.Medium

import java.util.*


// Complete the biggerIsGreater function below.
fun biggerIsGreater(w: String): String {
    val charArray = w.toCharArray()
    val n = charArray.size;
    var endIndex = 0;
    // Start from the right most character and find the first character
    // that is smaller than previous character.
    run {
        endIndex = n - 1
        while (endIndex > 0) {
            if (charArray[endIndex] > charArray[endIndex - 1]) {
                break
            }
            endIndex--
        }
    }

    // If no such char found, then all characters are in descending order
    // means there cannot be a greater string with same set of characters

    // If no such char found, then all characters are in descending order
    // means there cannot be a greater string with same set of characters
    if (endIndex == 0) {
        return "no answer"
    } else {
        val firstSmallChar = charArray[endIndex - 1].toInt()
        var nextSmallChar = endIndex

        // Find the smallest character on right side of (endIndex - 1)'th
        // character that is greater than charArray[endIndex - 1]
        for (startIndex in endIndex + 1 until n) {
            if (charArray[startIndex] > firstSmallChar.toChar() && charArray[startIndex] < charArray[nextSmallChar]) {
                nextSmallChar = startIndex
            }
        }

        //Swap the above found next smallest character with charArray[endIndex - 1]
        swap(charArray, endIndex - 1, nextSmallChar)

        //Sort the charArray after (endIndex - 1)in ascending order
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
    for (TItr in 1..T + 1) {
        val w = scan.nextLine()
        val result = biggerIsGreater(w)

        println(result)
    }
}
