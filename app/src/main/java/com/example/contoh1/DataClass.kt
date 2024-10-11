package com.example.contoh1

data class DataClass(
    val id:Int,
    var email:String
)

fun main(){
    val data = DataClass(1,"indra@gmail.com")
    println(data)

    //fungsi equal
    val data2 = DataClass(1,"makan@gmail.com")
    println(data == data2)
}