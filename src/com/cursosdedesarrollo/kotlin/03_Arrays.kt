package com.cursosdedesarrollo.kotlin


fun main(args: Array<String>) {
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    println(x[0])

    // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
    var asc = Array(5, { i -> (i * i).toString() })

    var arrI = Array(5, { i -> i })

    //inicialización a 0
    arrI= Array(5, {0})

}
