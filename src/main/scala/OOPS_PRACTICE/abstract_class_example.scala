package OOPS_PRACTICE


// We use this abstract class whenever third party tools need access that time we use abstract class
// Abstract class to hide the method in the class which is not able to see for endusers
// we can't add more than one abstract class into inheritance class
// alternately we can use traits to overcome this issue
// Abstract means hiding the main implementation from the end users


abstract class example {
  def abs_method() // Abstract-Method

  def nonabs_method2(): Unit ={ //non-abstract method and it is optional to declare in the incremental class
    println("this is non-abstract method if there is implementation it is equal to non-abstract method")
  }

  def nonabs_method3(): Unit ={ // This is a abstract method if we want to declare a non-abstract method in incremental class use override before method
    println("this is non-abstract method3")
  }
}

/*abstract class abs_class{
  def abs_method4(): Unit = {}
}*/

class example2() extends example /*with abs_class */{ // Here you can observe i am not able to add another abstract class buz its supports only one.

  def abs_method(): Unit ={
    println("In the incremental class we have to implement the body with abstract method")
  }
  override def nonabs_method3(): Unit ={ // Use the override method incase if want to update implementation
  println("im using the override method in the incremental class")
  }

}
object test11{
  def main(args:Array[String]):Unit = {
    val objjj = new example2
    objjj.abs_method()
    objjj.nonabs_method2()
    objjj.nonabs_method3()
}

}