package hackerrank.Medium



/*
 * Complete the 'nonDivisibleSubset' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. INTEGER_ARRAY s
 */

fun nonDivisibleSubset(k: Int, s: Array<Int>): Int {
    // Write your code here
    val f = ArrayList<Int>(k);
    for (i in s.indices) f[s[i] % k]++
    if(k%2==0) {
        f[k / 2] = f[k / 2].coerceAtLeast(1);
    }

    var res = f[0].coerceAtLeast(1);

        for (j in 1..k/2) {
            res += f[j].coerceAtMost(f[k - j]);
          }
    return res;

}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = nonDivisibleSubset(k, s)

    println(result)
}
