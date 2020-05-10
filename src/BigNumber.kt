import java.util.Scanner

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`);
    var n = scanner.nextInt();
    var sum: Long = 0;
    var arr = readLine()!!.split(' ').map { it.toLong() };
    if (n >= 1 && n <= 10) {
        if (arr.size >=1) {
        for(num in arr.indices){
            sum += arr[num]
        }
        }
    }
    println(sum);
}