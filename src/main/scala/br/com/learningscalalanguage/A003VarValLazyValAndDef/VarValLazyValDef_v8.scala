package br.com.learningscalalanguage.A003VarValLazyValAndDef

object VarValLazyValDef_v8 extends App {
  val data = {println ("Array is initialized"); Array(
    "MSFT", "GOOG", "TM"
  )}

  println("Before accessing data")
  data.foreach(println)

  println("---------------------")

  data(0) = "AAPL"
  data(2) = "TSLA"

  data.foreach(println)
}

