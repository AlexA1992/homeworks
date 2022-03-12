package ru.netology

fun main(){
    val likes: Int = 127
    if ((likes % 10 == 1 || likes == 1) && likes != 11) {
        println("Вы получили: $likes" + " лайк")
    }
    else if (likes >= 2 && likes <= 4){
        println("Вы получили: $likes" + " лайка")
    }
    else if (likes >= 5 && likes <= 20) {
        println("Вы получили: $likes" + " лайков")}
    else if (likes % 10 >= 2 && likes % 10 <= 4) {
        println("Вы получили: $likes" + " лайка")
    } else {println("Вы получили: $likes" + " лайков")}

}