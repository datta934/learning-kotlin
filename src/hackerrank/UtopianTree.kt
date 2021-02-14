import java.util.*


fun utopianTree(n: Int): Int {
    return (1 shl (n shr 1) + 1) - 1 shl n % 2
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 0..t) {
        val n = scan.nextLine().trim().toInt()

        val result = utopianTree(n)

        println(result)
    }
}