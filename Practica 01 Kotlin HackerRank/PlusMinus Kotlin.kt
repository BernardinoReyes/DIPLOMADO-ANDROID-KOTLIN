package diplomado.practicas.kotlin


import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
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

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {


    var negative = 0f
    var positive = 0f
    var zero = 0f

    positive = Arrays.stream(arr).filter { i -> i > 0 }.count().toFloat()
    negative = Arrays.stream(arr).filter { i -> i < 0 }.count().toFloat()
    zero = Arrays.stream(arr).filter { i -> i == 0 }.count().toFloat()

    println(BigDecimal((positive / arr.size).toDouble()).setScale(6, BigDecimal.ROUND_HALF_UP))
    println(BigDecimal((negative / arr.size).toDouble()).setScale(6, BigDecimal.ROUND_HALF_UP))
    println(BigDecimal((zero / arr.size).toDouble()).setScale(6, BigDecimal.ROUND_HALF_UP))

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
