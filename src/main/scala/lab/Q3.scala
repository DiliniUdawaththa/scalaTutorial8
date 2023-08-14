package lab

object Q3 {
  val toUpper:String => String = input =>{
    input.toUpperCase()
  }

  val toLower: String => String = input => {
    input.toLowerCase()
  }

  val formatNames:(String, String=>String) => String = (name: String, formatFn: String => String) => {
    formatFn(name)
  }

  def main(args: Array[String]): Unit = {
    var name = "Benny"
    println(formatNames(name,toUpper))

    name = "Niroshan"
    val firstHalf = name.substring(0, 2)
    val secondHalf = name.substring(2)
    print(formatNames(firstHalf,toUpper))
    println(formatNames(secondHalf,toLower))


    name = "Saman"
    println(formatNames(name,toLower))

    name = "Kumara"
    val first = name.substring(0, 1)
    val second = name.substring(1, 5)
    val third = name.substring(5)
    print(formatNames(first, toUpper))
    print(formatNames(second, toLower))
    print(formatNames(third, toUpper))
  }

}
