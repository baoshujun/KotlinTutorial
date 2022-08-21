package com.bsj.kotlintutorial.base

class MyTestException:Exception("这是自定义异常"){

}

fun checkOperation1(number: Int?){
    number?:throw  MyTestException()
}

fun main(){
    var number:Int? = null
   // checkOperation1(number)
    number = checkNotNull(number,{"操作不合法"})
}
