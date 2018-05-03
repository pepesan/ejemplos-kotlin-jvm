package com.cursosdedesarrollo.kotlin

import com.sun.xml.internal.fastinfoset.util.StringArray
import java.lang.Integer.parseInt

fun main(args : Array<String>) {
    var a=1
    var b=2
    var max = a
    if (a < b) max = b

    // With else

    if (a > b) {
        max = a
    } else {
        max = b
    }

    // As expression
    max = if (a > b) a else b
    println(max)


    max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
    println(max)

    var x=1
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // Note the block
            println("x is neither 1 nor 2")
        }
    }


    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    var s="1"
    when (x) {
        parseInt(s) -> println("s encodes x")
        else -> println("s does not encode x")
    }

    var validNumbers: Array<Int> = arrayOf(1,2,3,4)
    when (x) {
        in 1..10 -> println("x is in the range")
        in validNumbers -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }

    fun hasPrefix(x: Any) = when(x) {
        is String -> x.startsWith("prefix")
        else -> false
    }

    var devuelto =hasPrefix(s)
    println(devuelto)

    var collection: Array<String> = arrayOf("1","2","3")
    for (item in collection) {
        println(item)
    }
    for (i in 1..3) {
        println(i)
    }
    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    for (i in collection.indices) {
        println(collection[i])
    }
    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if (i>5) break@loop
        }
    }

    x=2
    while (x > 0) {
        x--
        println(x)
    }
    x=2
    do {
        println(x)
        x--
    } while (x >=0) // y is visible here!
}