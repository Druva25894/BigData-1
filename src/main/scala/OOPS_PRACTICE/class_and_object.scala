package OOPS_PRACTICE

class class_and_object {

  /** Defining variables which can be accessed all over the class and inherited class
   * we cant create a object inside the  class
   * we can declare a method inside a class
   * In class we can define variables and methods inside a class which can be accessible over the object by extending.
   *
   */

  var name = "krishna"
  var age = 25
  var place = "string"

  // Inside the class is called Method
  def method(): Unit ={
    println("details of gk :" + name+","+age+","+place)
  }
}

/** we can create a main method in object only and it is a entry point also
 * we have to instantiate the class with new keyword
 *
 */
object tst {
  def main(args:Array[String]):Unit = {
    // Here i am initiating the class into new object and assign to obj
    val obj = new class_and_object
    // Calling a method inside the class
    obj.method()

  }
}