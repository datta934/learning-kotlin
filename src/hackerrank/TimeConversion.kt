import java.util.*

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    var time = s.split(":").toMutableList()
    var newTime =""
    if (s.contains("AM")) {
        time[2] = time[2].replace("AM", "")
        if(time[0] == "12"){
            newTime= "00:"+time[1]+ ":" +time[2];
            return newTime;
        }else{
            time[2] = time[2].replace("AM", "")
            newTime= time[0] + ":"+time[1]+ ":" +time[2];
            return  newTime;
        }
    } else {
        time[2] = time[2].replace("PM", "")
        if(time[0] == "12"){
            newTime= "12:"+time[1]+ ":" +time[2];
            return newTime
        }else{
            var hh = time[0].toInt() + 12;
            newTime = hh.toString() + ":" + time[1]+ ":" +time[2];
            return  newTime;
        }

    }
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}
