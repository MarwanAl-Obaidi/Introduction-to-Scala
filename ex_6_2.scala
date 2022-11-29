object Calculator extends App {
  var n = 0
  for(n <- 1 to 20) {
    //println("Sum = " + n * (n + 1) / 2)
    if (n == 20) {
      println("Sum = " + n * (n + 1) / 2)
    }
  }
}