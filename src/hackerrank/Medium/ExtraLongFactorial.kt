import java.math.BigInteger
import java.util.*


// Complete the extraLongFactorials function below.
fun extraLongFactorials(n: Int): BigInteger {
    var factorial = BigInteger.ONE
    for (i in 1..n) {
        factorial = factorial * i.toBigInteger();
    }
    return factorial;
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    println(extraLongFactorials(n));
}
