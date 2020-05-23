package algorithms.search
import java.util.Scanner;

fun linearSearch(arr: Array<Int>, search :Int) : Int{
   for(i in arr.indices){
       if(arr[i] == search){
            return i;
       }
   }
    return -1;
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    val search = scan.nextInt();

    val pos = linearSearch(arr, search);
    if(pos >= 0 ) {
        println(pos)    // to print position at last
    } else {
        println("Position not found")
    }
}

