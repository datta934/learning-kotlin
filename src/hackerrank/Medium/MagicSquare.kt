package hackerrank.Medium

import java.util.*


// Complete the formingMagicSquare function below.
fun formingMagicSquare(s: Array<Array<Int>>): Int {
    val cost = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0)
    val t = arrayOf(
        intArrayOf(4, 9, 2, 3, 5, 7, 8, 1, 6),
        intArrayOf(4, 3, 8, 9, 5, 1, 2, 7, 6),
        intArrayOf(2, 9, 4, 7, 5, 3, 6, 1, 8),
        intArrayOf(2, 7, 6, 9, 5, 1, 4, 3, 8),
        intArrayOf(8, 1, 6, 3, 5, 7, 4, 9, 2),
        intArrayOf(8, 3, 4, 1, 5, 9, 6, 7, 2),
        intArrayOf(6, 7, 2, 1, 5, 9, 8, 3, 4),
        intArrayOf(6, 1, 8, 7, 5, 3, 2, 9, 4)
    )
    for (i in 0..7) {
        cost[i] = Math.abs(t.get(i).get(0) - s[0][0]) + Math.abs(t.get(i).get(1) - s[0][1]) + Math.abs(
            t.get(i).get(2) - s[0][2]
        )
        cost[i] =
            cost.get(i) + Math.abs(t.get(i).get(3) - s[1][0]) + Math.abs(t.get(i).get(4) - s[1][1]) + Math.abs(
                t.get(i).get(5) - s[1][2]
            )
        cost[i]=
            cost.get(i) + Math.abs(t.get(i).get(6) - s[2][0]) + Math.abs(t.get(i).get(7) - s[2][1]) + Math.abs(
                t.get(i).get(8) - s[2][2]
            )
    }

    Arrays.sort(cost)
    return cost[0]

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = Array<Array<Int>>(3, { Array<Int>(3, { 0 }) })

    for (i in 0 until 3) {
        s[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = formingMagicSquare(s)

    println(result)
}
