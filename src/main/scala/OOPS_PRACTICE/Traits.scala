package OOPS_PRACTICE

// Scala program to illustrate the
// multiple inheritance using traits

trait exp1{
  def print: Unit ={
    println("this is trait 1 ")
  }
}

trait exp2{
  def print2: Unit ={
    println("this is trait 2")
  }
}

trait exp3{
  def print3: Unit ={
    println("this is trait 3")
  }
}

class traits extends exp1 with exp2 with exp3{
 /* def print()
  def print2()
  def print3()*/
}

object tt {
  def main(args: Array[String]): Unit = {
    val obj = new traits
    obj.print
    obj.print2
    obj.print3
  }
}