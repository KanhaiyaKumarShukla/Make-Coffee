package com.example.makecoffee

fun main(){
//    println("Who is this coffee for?")
//    val name=readln()
//    println("How many spoon(s) of sugar do you want?")
//    val sugarCount=readln().toInt()
//    makeCoffee(name,sugarCount)
     val coffeeForDenis=CoffeeDetail("Denis", 3, "large", 1)
     makeCoffee(coffeeForDenis)
}
data class CoffeeDetail(
    val name: String,
    val sugarCount: Int,
    val size:String,
    val creamAmount:Int
)
fun makeCoffee(coffeeDetail: CoffeeDetail){
    println("Coffee with " +
            (when (coffeeDetail.sugarCount) {
                1 -> "${coffeeDetail.sugarCount} spoon of"
                0 -> "no"
                else -> "${coffeeDetail.sugarCount} spoons of"
            }) +
            " sugar and " +
            (when (coffeeDetail.creamAmount) {
                1 -> "${coffeeDetail.creamAmount} "
                0 -> "no"
                else -> "${coffeeDetail.creamAmount}"
            }) +
            "cream for ${coffeeDetail.name}"
    )

}