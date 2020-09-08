import java.util.*

// Complete the timeInWords function below.
fun timeInWords(h: Int, m: Int): String {
    var time ="";
    val nums = arrayOf(
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine",
        "ten", "eleven", "twelve", "thirteen",
        "fourteen", "fifteen", "sixteen", "seventeen",
        "eighteen", "nineteen", "twenty", "twenty one",
        "twenty two", "twenty three", "twenty four",
        "twenty five", "twenty six", "twenty seven",
        "twenty eight", "twenty nine"
    )
    if (m == 0)
        time = nums[h] + " o' clock ";
    else if (m == 1)
        time = "one minute past " +
                nums[h];

    else if (m == 15)
        time="quarter past " + nums[h];

    else if (m == 30)
        time="half past " + nums[h];

    else if (m == 45)
        time="quarter to " +
                nums[(h % 12) + 1];

    else if (m <= 30)
        time= nums[m] + " minutes past " +
                nums[h];

    else if (m > 30)
        if((60 - m)==1) {
            time = nums[60 - m] + " minute to " +
                    nums[(h % 12) + 1];
        }else{
            time = nums[60 - m] + " minutes to " +
                    nums[(h % 12) + 1];
        }
    return time;
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val h = scan.nextLine().trim().toInt()

    val m = scan.nextLine().trim().toInt()

    val result = timeInWords(h, m)

    println(result)
}
