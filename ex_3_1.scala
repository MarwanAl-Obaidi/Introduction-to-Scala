object Initials extends App {
  println(printInitials("John", "Smith"))
  def printInitials(firstName: String, lastName: String) : String = {
    var fullName = firstName + " " + lastName
    return firstName.charAt(0) + "." + lastName.charAt(0) + "."
    }
}

// Another way to solve the exercise
/* object Initials extends App {
  println(NameUtils.printInitials("John", "Smith"))
  
  object NameUtils {
    def printInitials(firstName: String, lastName: String) : String = {
        var fullName = firstName + " " + lastName
        return firstName.charAt(0) + "." + lastName.charAt(0) + "."
        }
    }
} */