import java.util.Scanner;

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`);
    var length = scanner.nextInt();
    var sum = 0;
    var mainArray = readLine()!!.split(' ').map { it.toInt() }
    for (num in mainArray.indices) {
        sum += mainArray[num];
    }
    println(sum);
}