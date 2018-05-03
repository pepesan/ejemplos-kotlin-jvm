package com.cursosdedesarrollo.kotlin


fun double(x: Int): Int {
    return 2 * x
}
/*
fun powerOf(number: Int, exponent: Int) {
    var ret=0
    for (i in exponent)
        ret=ret+number*exponent
    return ret
}
*/
fun main(args : Array<String>) {
    var x=double(2)
    println(x)
}