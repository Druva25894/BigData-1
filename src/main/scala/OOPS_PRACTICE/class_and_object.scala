package OOPS_PRACTICE

class class_and_object {

  // Defining variables which can be accessed all over the class and inherited class
  var name = "krishna"
  var age = 25
  var place = "string"

  // Inside the class is called Method
  def method(): Unit ={
  println("details of gk :" + name+","+age+","+place)
  }
}

object test{
  //Def main method for object
  def main(args:Array[String]):Unit = {

    // Here i am initiating the class into new object and assign to obj
    val obj = new class_and_object
    // Calling a method inside the class
    obj.method()

  }
}