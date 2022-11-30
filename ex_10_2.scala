import java.io.File
import java.io.PrintWriter
import scala.io.Source

object LanguageProgram extends App {
  val languages = Array("Java", "Perl", "Python", "Scala", "C#")
  val myFile = new File("languages.txt")
  val myWriter = new PrintWriter(myFile)

  // Write
  languages.foreach(languages => myWriter.write(languages + "\n"))
  myWriter.close()

  // Read
  val readFile = Source.fromFile("languages.txt")

  for (line <- readFile.getLines) {
    println(line)
  }

}