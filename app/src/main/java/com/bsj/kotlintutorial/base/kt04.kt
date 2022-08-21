package com.bsj.kotlintutorial.base

fun main(){
    val bb:(age:Int,name:String,sex:Int) -> String = { age:Int,name:String,sex:Int ->
        val holiday = "New Year."
        var str = "Happy $holiday"
        "$str your age =$age;you name=$name;you sex =${if(sex == 2) "男" else "女"}"
    }
    print(bb(12,"张三",2))

}