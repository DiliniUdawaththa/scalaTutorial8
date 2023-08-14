package lab

import scala.io.StdIn

object Q1 {
  val interest: Double => Double = deposit =>{
    if(deposit <= 20000){
      0.02 * deposit
    }
    else if(deposit <= 200000){
      0.04 * deposit
    }
    else if(deposit <= 2000000 ){
      0.035 * deposit
    }
    else
      0.065 * deposit
  }

  def main(args:Array[String]): Unit = {
    print("Enter your income: ")
    val income = StdIn.readInt() //Take income as a user input

    val annualInterest = interest(income)
    println("Your annual interest is: " + annualInterest)
  }
}
