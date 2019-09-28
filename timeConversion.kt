import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String? {

    try {
        val inFormat = SimpleDateFormat("hh:mm:ssaa")
        val outFormat = SimpleDateFormat("HH:mm:ss")
        return outFormat.format(inFormat.parse(s))
    } catch (e: ParseException) {
        e.printStackTrace()
    }

    return null
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}
