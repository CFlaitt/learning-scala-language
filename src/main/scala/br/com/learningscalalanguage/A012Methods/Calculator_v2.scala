package br.com.learningscalalanguage.A012Methods

object Calculator_v2 extends App {

  def computeSum(a: Int, b: Int): Int = {
    return a + b
  }

  def printSum(a: Int, b: Int): Unit = {
    println("Sum of a and b is: " + (a + b))
  }

  val result = Calculator.computeSum(5, 6)

  println("Result is: " + result)

  Calculator.printSum(11, 12)
}
