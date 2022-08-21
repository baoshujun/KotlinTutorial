package com.bsj.kotlintutorial.base

fun main (){
    val getDiscountWords:(goodsName:String,hour:Int) -> String = { goodsName:String, hour:Int ->
        val  currentYear = 2027
        "$currentYear 年，双11${goodsName}促销倒计时：${hour} 小时"
    }
    showOnBord("餐厅纸",getDiscountWords)
}

fun showOnBord(goodName:String,showDisCount:(String,Int)->String){
    //1-24之间取随机数
    val hour:Int = (1..24).shuffled().last()
     print(showDisCount(goodName,hour))
}