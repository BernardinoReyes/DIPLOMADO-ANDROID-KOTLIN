package diplomado.practicas.verybigsum

import java.util.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the aVeryBigSum function below.

fun aVeryBigSum(ar: Array<Long>): Long {

    var sum: Long = 0
    for (i in ar.indices) {
        sum += ar[i]

    }
    return sum
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}
