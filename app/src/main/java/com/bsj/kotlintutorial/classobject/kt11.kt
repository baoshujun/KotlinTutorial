package com.bsj.kotlintutorial.classobject

import kotlin.math.absoluteValue

class Player {
    //分析点1
    var name = "abc"
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }
    var age = 10
        get() = field.absoluteValue
        private set(value) {
            field = value.absoluteValue
        }
    val rolledValue
        //取随机数
        get() = (1 until 6).shuffled().first()

    var words: String? = null //分析点2

    fun saySomeThine() {
        //分析点3
        words?.also { "Hello ${it.toUpperCase()}" }.run(::println)
    }
}
fun main(){
    var player = Player()
    player.name = "tom"
    //player.age=-10 //因为set被改成私有，所以这里报错
    player.words="main hello"
    println(player.name)
    println(player.age)
    println(player.rolledValue)
    player.saySomeThine()
}
