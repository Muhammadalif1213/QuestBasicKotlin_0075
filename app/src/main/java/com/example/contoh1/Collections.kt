package com.example.contoh1

fun ContohList(){
    println("=== List ===")
    // List Read-Only
    val readOnlyAbjad = listOf("A","B","C")
    println(readOnlyAbjad)

    //list Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    //Menambahkan data kedalam list mutable
    shape.add("Circle")
    println(shape)

    //menghapus data dari list mutable
    shape.remove("Triangle")
    println(shape)

    println(shape.first())
    println(shape.last())
    println(shape.count())

    shape.removeAt(1)
    println(shape)

    //mengubah data didalam list mutable
    shape[0] = "Oval"
    println(shape)

    //list read-only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

fun main(){
    println(ContohList())
}