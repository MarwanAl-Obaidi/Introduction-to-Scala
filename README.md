# Introduction-to-Scala
A course I did that teaches the fundamentals of Scala programming.

## ex_1_1
Create Scala program (HelloScala.scala) that prints the text 'Hello World'

## ex_2_1
Create executable Scala object called Person.

Declare the following three variables:

| Variable name | Data type | Value |
| --- | --- | --- |
| firstName | String | Lisa |
| lastName | String | Patterson |
| age | Integer | 32 |

Use string interpolation to print the following text.

```
First name: Lisa, Last name: Patterson, Age: 32 years
```

## ex_2_2
Create Scala executable object called Intials that asks firstname and lastname. The program will then print out the intials of a name.

## ex_3_1
Create Scala executable object called Initials. It contains method called printInitials that takes two string paramaters: firstName and lastName. The method prints the intials of the name parameters. Call the method using the following values: firstName = "John", lastName = "Smith".

## ex_3_3
Create executable Scala object called Square. Create a function called square inside the object. The square function takes one integer parameter and returns the square of given parameter.

The program asks an integer from a user and then prints the result.

## ex_4_1
Create a program (AgeCheck.scala) that asks the age (integer) and prints Welcome if the given age is greater than 18. Otherwise it prints You are too young.

## ex_6_1
Create Scala program (Loops.scala) that prints the following numbers 1, 4, 7, 10, 13 using the for loop.

## ex_6_2
Create Scala program (Calculator.scala) that calculates the sum of first 20 natural numbers. Use for loop in the calculation.

## ex_6_3
Create Scala (Factorial.scala) program that calculates the factorial of given integer using the for loop.

## ex_7_5
Create Scala program (ShapeProgram.scala) that contains sealed trait called Shape. Create two case classes in the same file: Square(height: Int, width:Int) and Circle(radius: Int) and both classes extends the Shape trait.

Create method shapeInfo(shape: Shape): Unit that use pattern matching and prints 'This is square', if the passed argument is an instance of Square. If the passed argument is an instance of Circle, it prints 'This is circle'. In all other cases shapeInfo method prints 'Unknown shape'

Create an instance of Square and Circle classes and call the shapeInfo method using the both instances of Square and Circle classes and call shapeInfo method by passing both instances into the method.

## ex_10_2
Create Scala program (LanguageProgram.scala) that contains the following array.

```
val languages = Array("Java", "Perl", "Python", "Scala", "C#")
```

Create a new file called languages.txt (Without any path) and write the content of the languages array into the file. Then, read the file and print out the file content 