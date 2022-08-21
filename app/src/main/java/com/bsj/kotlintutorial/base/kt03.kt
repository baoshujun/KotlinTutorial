package com.bsj.kotlintutorial.base
var letter = "Mississippi"
fun main(){
  var total = letter.count()
    println(total)
    val total1 = letter.count {
        letter -> letter =='s'
    }
    println(total1)

}