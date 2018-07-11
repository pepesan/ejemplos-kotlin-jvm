package com.cursosdedesarrollo.kotlin


// Ejemplo de programación funcional
fun main(args : Array<String>) {
    //declaramos un listado y lo rellenamos con listOf
    var numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    for (number in numbers) {
        println(number)
    }
    var names: List<String> = listOf("Chike", "Nnamdi", "Mgbemena")
    for (name in names) {
        println(name)
    }
    println(names.size) // tamaño
    println(names.get(0)) // Primer elemento
    println(names.indexOf("Chike")) // posición
    println(names.contains("Chike")) //  presencia

    //convertimos de inmutable a mutable
    var mutables = names.toMutableList()
    mutables.add("Ruth") // ahora podemos añadir

    val emptyList: List<String> = emptyList<String>()

    println("Listado Vacío")
    for (name in emptyList) {
        println(name)
    }

    val mutableListNames: MutableList<String> = mutableListOf<String>("Josh", "Kene", "Sanya")

    mutableListNames.add("Mary")
    mutableListNames.removeAt(1)
    mutableListNames[0] = "Oluchi" //  Cambia el primero
// a mutable list of mixed types
    val mutableListMixed = mutableListOf("BMW", "Toyota", 1, 6.76, 'v')

}