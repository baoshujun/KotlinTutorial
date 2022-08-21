package com.bsj.kotlintutorial.base

fun main(){
   var hello:String = hello("tom")
    println(hello)

    /**
     * 调用方法时，如果方法有多个参数，则可以无序指定 传值
     */
    hello = hello(age =12, name = "lilei")
    println(hello)
    add(2,3f)
}
//方法的定义

private fun hello(name:String,age:Int = 12):String{
    return "Hi,my name is $name,my age is $age"
}

private fun add(a:Int,b:Float){
    print("a+b=${a+b}")
}