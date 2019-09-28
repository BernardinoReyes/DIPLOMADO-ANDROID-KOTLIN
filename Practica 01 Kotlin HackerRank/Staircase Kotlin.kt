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

// Complete the staircase function below.
fun staircase(n: Int): Unit {

    var stairString = String()

    for (i in 1..n) {
        stairString = Collections.nCopies(n - i, " ").joinToString(stairString) + Collections.nCopies(i, "#").joinToString(stairString)
        println(stairString)
        stairString = String()
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}