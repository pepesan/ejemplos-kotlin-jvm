package com.cursosdedesarrollo.kotlin


fun main(args : Array<String>) {
    var s = "Hello, world!\n"
    println(s)

    s = "abc" + 1
    println(s)

    s = """
    for (c in "foo")
        print(c)
    """
    println(s)

    s = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    println(s)

    val i = 10
    println("i = $i") // prints "i = 10"

    s = "abc"
    println("$s.length is ${s.length}") // prints "abc.length is 3"

}
