import java.util.Scanner;
fun staircase(n: Int): Unit {
    for (i in 0..n-1){
        for(j in 0..n-i-1){
            print(" ");
        }
        for(k in 0..i){
            print("#");
        }
        println();
    }

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}