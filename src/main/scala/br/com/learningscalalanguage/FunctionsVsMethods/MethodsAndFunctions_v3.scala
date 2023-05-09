package br.com.learningscalalanguage.FunctionsVsMethods

object MethodsAndFunctions_v3 extends App {

  val data = Array("PS", "MSFT", "GOOG", "AAPL", "TSLA")

  def getNumRowsMethod: Int = data.length

  val getNumRowsFunction = () => data.length

  println("Total number of rows (method): " + getNumRowsMethod)
  println("Total number of rows (function): " + getNumRowsFunction())
}
