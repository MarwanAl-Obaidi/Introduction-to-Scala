import scala.io.StdIn.readInt

object Factorial {
    def factorialIt(n: Int): Int ={
       var factorial = 1
       for(i <- 1 to n)
            factorial *= i
        return factorial
    }
    
    def main(args: Array[String]) {
		println("Type the integer:")
        //val n = 6
		val n = readInt()
        println("The factorial of " + n + " is " + factorialIt(n))
        
    }
}
