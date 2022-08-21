package com.bsj.kotlintutorial.base

fun main(){
   //letDemo();
   //  testLet()
    testOrEmpty()
}
//null.orEmpty()  当目标为null的时候，通过这个方法将会返回长度为0的空字符
fun testOrEmpty(){
  var  str:String?= null.orEmpty()
    if (str !=null){
        str = str.capitalize()
    }else{
        println("str 为 Null")
    }

    str = str?.capitalize().plus("is Great.lenth:${str?.length}")
    println(str)
    val  strWithSafe :String = str?:"butterfly"
    println(strWithSafe.length)
}

fun testLet(){
    var content:Int="asd".let {
        println("当前value为：$it")
        124  //外部确认了是Int类型，所以这里写非int类型的返回值直接语法提示错误！
    }
    var content1:Double=124.let{
        println("当前value为：$it")
        1.2 //外部确认了是Double类型，所以这里写非Double类型的返回值直接语法提示错误！
    }

    var content3  =1.256.let {
        println("当前value为：$it")
        "我是conent3" //这里可放任意类型的返回值
    }

    println(content3.javaClass.name)
}

fun letDemo(){
    var str:String? = ""?.let{
        //如果此字符序列不为空并且包含除空白字符以外的某些字符，则返回 true。
        if (it.isNotBlank()){
            it.replace("","",false)
        }else{
            //此处可放为空的逻辑处理
            "abc"
        }
    }
    println(str)
}

