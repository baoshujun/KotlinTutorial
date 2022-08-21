package com.bsj.kotlintutorial.base

fun main(){
    val str1 = "The people's Republic of china"
    val str2= str1.replace("p","a")
    println(str1)
    println(str2)
    println("-----------------------------")
    val str3 = str1.replace(Regex("[aesou]")) {
       // println("$it")
        when (it.value) {
            "a" -> "1"
            "e" -> "5"
            "s" -> "6"
            "o" -> "3"
            else -> it.value
        }
    }
    println(str1)
    println(str3)
}
