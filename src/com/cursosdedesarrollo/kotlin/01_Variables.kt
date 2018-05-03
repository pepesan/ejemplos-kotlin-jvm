package com.cursosdedesarrollo.kotlin

fun main(args : Array<String>) {
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
    println(oneMillion)
    println(creditCardNumber)
    println(socialSecurityNumber)
    println(hexBytes)
    println(bytes)

    val a: Int = 10000
    println(a === a) // Prints 'true'
    val boxedA: Int = a
    val anotherBoxedA: Int = a
    println(boxedA === anotherBoxedA) // !!!Prints 'false'!!!
    println(boxedA == anotherBoxedA) // Prints 'true'
    // Hypothetical code, does not actually compile:
    val a2: Int = 1 // A boxed Int (java.lang.Integer)
    val b2: Long = 0L + a2 // conversión explícita de variable
    //casting
    println(a2.toLong() == b2) // Surprise! This prints "false" as Long's equals() check for other part to be Long as well

    val b4: Byte = 1 // OK, literals are checked statically
    //val i: Int = b4 // ERROR
    val i: Int = b4.toInt() // OK: explicitly widened

    //variables nullables
    val a3: String = "abc"
    //a = null // compilation error
    //declaro una variable nullable
    var b3: String? = "abc"
    b3 = null // ok

    //intento acceder a un valor sabiendo que debe existir
    val l = a3.length
    println(l)
    //accedo a un valor nullable intentando capturar el valor de la vairable si existe
    val l2 = b3?.length
    println("Valor nullable:"+l2)

    var obj:String= "Hola"
    if (obj is String) {
        println(obj.length)
    }
    /*
    var obj2:Int=2

    if (obj2 !is String) { // same as !(obj is String)
        println("Not a String")
    }
    else {
        println(obj2.length)
    }

    Averiguar porque no hay casting automatico
    var x: Int=1
    if (x is String) {
        print(x.length) // x is automatically cast to String
    }
    */

}