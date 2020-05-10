import java.util.Scanner;

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    var amount: Int = reader.nextInt()
    var balance: Double = reader.nextDouble()
    if (amount < balance && amount % 5 == 0 && (amount+0.50 <= balance)) {
        print(balance - (amount + 0.50));
    } else {
        println(balance)
    }
}