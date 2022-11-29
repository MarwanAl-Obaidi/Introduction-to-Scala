import scala.io.StdIn.readInt

object AgeCheck extends App {
  println("What is your age?")
  val age = readInt()

  if (age >= 18) {
    println("Welcome")
  } else if (age < 18) {
    println("You are too young")
  } else {
    println("ERROR")
  }
}