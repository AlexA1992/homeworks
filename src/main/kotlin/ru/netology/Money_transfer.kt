package ru.netology

import java.math.BigDecimal

fun main(){
    val amount: Long = 500000
    val commission: Double = if(amount * 0.75 / 100 > 3500) amount * 0.75 / 100 else 3500.0

println("Ваш перевод составит: $amount" + " копеек")
println("Ваша комиссия составит: $commission" + " копеек")
}
