import scala.io.StdIn.readInt

object Square extends App {
  val addOne = (x: Int) => x * x
  println("Type an integer")
  val number = readInt()
  println("Square = " + addOne(number))
}