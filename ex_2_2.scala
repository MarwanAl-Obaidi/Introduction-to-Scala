import scala.io.StdIn.readLine

object Initials extends App {
  println("Type your firstname")
  val firstname = readLine()
  println("Type your lastname")
  val lastname = readLine()

  println("Your intials:" + firstname.charAt(0) + "." + lastname.charAt(0) + ".")
}