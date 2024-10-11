package com.example.contoh1

fun nullSafety(){
    var neverNull: String = "This can't be null"

    var nullable: String? = "you can keep a null here"
}

fun main(){
    nullSafety()
}