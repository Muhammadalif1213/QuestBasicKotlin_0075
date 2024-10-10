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

fun ContohSet(){
    println()
    println("==== Set ===")

    //set read only
    val readOnlyAbjad = setOf("A","B","C")
    println(readOnlyAbjad)

    //set Mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square","Triangle")
    println(shape)

    //menambahkan data ke set mutable
    shape.add("Rectangle")
    println(shape)

    //menghapus data dari set mutable
    shape.remove("Circle")
    println(shape)

    //set read-Only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)


}

fun ContohMap(){

    println()
    println("=== Map ===")
    //map Read-Only
    val ReadOnlyShape: Map<String,Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(ReadOnlyShape)

    //Map Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    //menambahkan data ke dalam map mutable
    shape["Rectangle"] = 4
    println(shape)

    //menghapus data di dalam map mutable
    shape.remove("Circle")
    println(shape)

    //Mengubah data di dalam map mutable
    shape["Square"] = 5
    println(shape)

    //Map read-Only
    val shapesLocked: Map<String,Int> = shape
    println(shapesLocked)

}

fun main(){
    println(ContohList())
    println(ContohSet())
    println(ContohMap())
}