package algorithms.search

import java.util.Scanner;

fun binarySearch(arr: Array<Int>, search :Int) : Int{
    var left = 0;
    var right = arr.size+1;
    var middle: Int;
    while(left <= right) {
        middle = left + ((right - left) / 2)
        when {
            search >arr[middle]   -> left = middle+1    // element is greater than middle element of array, so it will be in right half of array
            search == arr[middle] -> return middle // found the element
            search < arr[middle]  -> right = middle-1   //element is less than middle element of array, so it will be in left half of the array.
        }
    }
    return -1;

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    val search = scan.nextInt();

    val pos = binarySearch(arr, search);
    if(pos >= 0 ) {
        println(pos)    // to print position at last
    } else {
        println("Position not found")
    }
}