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

fun main(){
    withoutParameter()
    withParameter("John")
    withNamedArgumrnt(name = "john", age = 30)
}