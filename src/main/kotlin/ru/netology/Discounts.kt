package ru.netology

fun main() {
    var prevoiousPurchase: Long = 20_000_000
    val thisPurchase: Long = 100_000_000
    val isMeloman: Boolean = true

    var basicDiscount: Long = 0
    if (prevoiousPurchase >= 0 && prevoiousPurchase <= 100_000) {
        basicDiscount = 0
    }
    if (prevoiousPurchase >= 100_100 && prevoiousPurchase <= 1_000_000) {
        basicDiscount = 10000
    }
    if (prevoiousPurchase >= 100100) {
        basicDiscount = thisPurchase * 5 / 100
    }
    val afterBasicDiscount: Long = thisPurchase - basicDiscount
    val prevoiousPurchasePublic = prevoiousPurchase / 100
    val thisPurchasePublic = thisPurchase / 100
    val basicDiscountPublic = basicDiscount / 100
    val afterBasicDiscountPublic = afterBasicDiscount / 100
    println("Ваша предыдущая покупка: $prevoiousPurchasePublic" + " рублей")
    println("Эта покупка до скидок: $thisPurchasePublic" + " рублей")
    println("Ваша основная скидка: $basicDiscountPublic" + " рублей")
    println("Стоимость после основной скидки: $afterBasicDiscountPublic" + " рублей")

    var afterMelomanDiscount: Long = 0
    if (isMeloman == true) {
        afterMelomanDiscount = afterBasicDiscount * 99 / 100
    }
    val afterMelomanDiscountPublic = afterMelomanDiscount / 100
    if (isMeloman == true) {
        println("Скидка меломана: 1%")
    } else {
        println("Скидка меломана: 0%")
    }
    println("Стоимость после скидки меломана: $afterMelomanDiscountPublic" + " рублей")
}