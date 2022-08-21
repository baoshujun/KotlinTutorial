package com.bsj.kotlintutorial.base


fun  main() {
    //1. 打印变量的类型
   // printClassName()

    //2.
   // printIf()
    //3
   // printWhen()
   //4
    printWhen2()
}

fun printClassName(){
    var hello = "hello"
    println(hello.javaClass.name)
}

fun printIf(){
    val flag = false
    println("${if(flag) "I love you" else "you are good"}")
}

 fun printWhen(){
     val school = "小学"
     val level:Any = when (school){
         "学前班"->"幼儿"
         "小学"->"少儿"
         "中学"->"青少年"
         "大学"->"成年"
         else -> {
             println("未知")
         }
     }

     println(level)
 }


fun printWhen2(){
    var age = 12
    age++
    when(age){
       in 0..8 ->{
           println("少儿，年龄为：$age")
       }
       in 8..18 ->{
           println("青少年，年龄为：$age")
       }
        else ->{
            println("成年，年龄为：$age")
        }

    }
}