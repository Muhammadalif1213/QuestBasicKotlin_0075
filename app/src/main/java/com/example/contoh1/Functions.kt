package com.example.contoh1

fun withoutParameter(){
    println("== withoutParameter==")
    println("Hello, World!")
}

fun withParameter(name: String){
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

//nemed argument
//named argument merupakan cara untuk memanggil
fun withNamedArgumrnt(name: String, age: Int){
    println()
    println("== withNamedArgument ==")
    println("Hello, $name you are $age years old")
}

//default parameter value
//default parameter value merupakan cara untuk memberikan nilai default pada parameter fungsi
fun withDefaultParameter(name:String = "Indra", age: Int){
    println()
    println("== withDefaultParameter ==")
    println("Hello $name you are $age years old.")
}

fun withReturn(panjang:Int, Lebar:Int){
    return println(panjang * Lebar)
}

fun main(){
    withoutParameter()
    withParameter("John")
    withNamedArgumrnt(name = "john", age = 30)
    withDefaultParameter(age = 25)
}