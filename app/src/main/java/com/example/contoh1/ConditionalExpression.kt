package com.example.contoh1

fun conditionalStatement(){
    println("=== Conditional Expression ===")

    //if else
    val number = 10
    if (number > 0) {
        println("Positive Number")
    }else{
        println("Negative Number")
    }

    //When
    val day = 1
    when (day) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Invalid Day")
    }
}


fun main(){
    conditionalStatement()
}