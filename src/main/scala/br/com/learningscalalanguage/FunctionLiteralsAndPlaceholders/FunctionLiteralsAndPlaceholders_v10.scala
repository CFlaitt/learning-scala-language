package br.com.learningscalalanguage.FunctionLiteralsAndPlaceholders

object FunctionLiteralsAndPlaceholders_v10 extends App {

  val googStockPrices = List(1367.36, 1360.66, 1394.20,
    1393.33, 1404.31, 1419.82, 1429.73)

  val googStockPricesGreaterThan1400 =
    googStockPrices.filter(_ > 1400)

  println(googStockPricesGreaterThan1400)
}
