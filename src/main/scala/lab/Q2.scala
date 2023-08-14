package lab

import scala.io.StdIn

object Q2 {
  val patternMatching:Int => String = num =>{
    if(num < 0)
      "NEGATIVE NUMBER"
    else if(num == 0)
      "ZERO"
    else if(num%2==0)
      "EVEN NUMBER"
    else
      "ODD NUMBER"
  }

  def main(args:Array[String]): Unit = {
    print("Enter the number: ")
    val num = StdIn.readInt() //takes the integer input from commandline

    println(patternMatching(num))
  }
}
