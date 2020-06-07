import java.util.*
import kotlin.io.*
import kotlin.text.*

// Complete the catAndMouse function below.
fun catAndMouse(x: Int, y: Int, z: Int): String {
    var cat1 = Math.abs(z - x);
    var cat2 = Math.abs(z - y);
    if (cat1 < cat2) {
        return "Cat A";
    } else if (cat1 > cat2) {
        return "Cat B";
    } else {
        return "Mouse C";
    }

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val xyz = scan.nextLine().split(" ")

        val x = xyz[0].trim().toInt()

        val y = xyz[1].trim().toInt()

        val z = xyz[2].trim().toInt()

        val result = catAndMouse(x, y, z)

        println(result)
    }
}
