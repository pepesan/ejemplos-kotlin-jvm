package com.cursosdedesarrollo.kotlin

import com.sun.corba.se.impl.orbutil.graph.Graph
import sun.security.provider.certpath.Vertex

//Definición de una función
fun double(x: Int): Int {
    return 2 * x
}


//paso de parámetros
fun suma(x: Int, y:Int) :Int{
    return x+y
}

//parámetros por defecto
fun multi(x:Int =0,y:Int=0):Int{
    return x*y
}

//Si una función no devuelve nada puede devolver Unit o no
fun devuelveSiQuieres(b:Boolean):Unit{
    if (b==true){
        return Unit
    }
}

//función en una sola línea
fun doble(x: Int): Int = x * 2

fun doble2(x: Int) = x * 2

//paso variable de argumentos
fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}


//funciones infix pueden llamarse sin .
infix fun Int.shl(x: Int): Int {
    return x+1
}


//Funciones locales
fun dfs(graph: Graph) {
    fun dfs(current: Graph, visited: Set<Vertex>) {

    }

    dfs(graph, HashSet())
}


//lambdas
fun hazAlgo(i:Int):Unit{
    println("algo")
}
fun setFuncionCallBack(listener:(Int)->Unit){
    listener(1)
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
    //llamada a función
    var x=double(2)
    println(x)
    x= suma(2,3)
    println(x)
    x= multi()
    println(x)
    x= multi(2)
    println(x)
    x= multi(2,3)
    println(x)
    //llamada mediante parámetros nombrados
    x= multi(x=3)
    println(x)
    x= multi(y=3)
    println(x)
    x= multi(x=2,y=3)
    println(x)
    x= multi(y=3,x=2)
    println(x)
    var u:Unit= devuelveSiQuieres(true)
    println(u)
    //llamando a la función de paso variable de argumentos
    var list = asList(1, 2, 3)
    println(list)
    list = asList(1, 2)
    println(list)
    list = asList()
    println(list)

    // llamando a la función infix
    1 shl 2

    // llamada tradicional a la función infix
    1.shl(2)


    //llamadas lambda
    setFuncionCallBack(fun (i: Int) {
            hazAlgo(i)

    })
    setFuncionCallBack( {i -> hazAlgo(i) } )

}

