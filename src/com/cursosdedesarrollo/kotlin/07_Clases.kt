package com.cursosdedesarrollo.kotlin

class Invoice {
}


class Persona {
    var nombre: String? = null

    constructor() {
        this.nombre = ""
    }

    constructor(nombre: String) {
        this.nombre = nombre
    }

    override fun toString(): String {
        return "Persona[nombre:" + this.nombre + "]"
    }
}

class Girl {
    var age: Int = 0
        get() = field
        set(value) {
            field = if (value < 18)
                18
            else if (value >= 18 && value <= 30)
                value
            else
                value-3
        }

    var actualAge: Int = 0
}

class Contador{
    private var contador:Int=0

    constructor(contador:Int =0){
        this.contador=contador
    }
    public fun getContador():Int{
        return this.contador
    }
    public fun inc(valor:Int=1){
        this.contador+=valor
    }
}
data class Person(var name: String="") {

}

data class Person2(var name: String="") {
    var age: Int = 0
}

open class Padre{
    var nombre: String? = null

    constructor(){
        this.nombre=""
    }
    constructor(nombre: String){
        this.nombre=nombre
    }
    override fun toString():String{
        return "Padre[nombre:"+this.nombre+"]"
    }
}

class Hija: Padre {
    var herencia:String? = null
    constructor(){
        super.nombre=""
        this.herencia=""
    }
    constructor(nombre:String){
        super.nombre=nombre
        this.herencia=""
    }
    constructor(nombre:String,herencia:String){
        super.nombre=nombre
        this.herencia=herencia
    }
    override fun toString():String{
        return "Hija[herencia:"+this.herencia+",nombre:"+this.nombre+"]"
    }
}

interface MyInterface {
    val prop: Int // abstract
    fun bar()
    fun foo() {
        println("foo")
    }
}
class Child : MyInterface {
    override val prop: Int = 29
    override fun bar() {
        println("bar")
    }
}

interface A {
    fun foo() { print("A") }
    fun bar()
}

interface B {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class C : A {
    override fun bar() { print("bar") }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}

fun main(args : Array<String>) {
    var objeto=Invoice()
    println(objeto)
    var persona=Persona()
    println(persona)
    persona=Persona("Pepe")
    println(persona)
    persona.nombre="Juan"
    println(persona)
    //getters y setters
    val maria = Girl()
    maria.actualAge = 15
    maria.age = 15
    println("Maria: actual age = ${maria.actualAge}")
    println("Maria: pretended age = ${maria.age}")

    val angela = Girl()
    angela.actualAge = 35
    angela.age = 35
    println("Angela: actual age = ${angela.actualAge}")
    println("Angela: pretended age = ${angela.age}")

    var contador=Contador(2)
    contador.inc(2)
    println(contador.getContador())

    var person: Person= Person()
    println(person)
    println(person.name)

    person= Person("Pepe")
    println(person)
    println(person.name)

    var person2: Person2= Person2()
    println(person2)
    println(person2.name)
    println(person2.age)

    person2= Person2("Pepe")
    println(person2)
    println(person2.name)


    var padre=Padre("Pepe")
    println(padre)
    var hija=Hija()
    println(hija)
    hija=Hija("Luisa")
    println(hija)
    hija=Hija("Luisa","Total")
    println(hija)
    var child=Child()
    child.foo()
    child.bar()
}


