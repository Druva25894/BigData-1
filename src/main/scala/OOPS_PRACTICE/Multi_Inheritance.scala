package OOPS_PRACTICE


// This is the Base Class
class Multi_Inheritance {

  var name = "krishna"
  var age = 25
}
// Here i am inheritate Base Class to Derived Class
class child2 extends Multi_Inheritance{

  var ph = 1234
}
// Here i am Inheriate Drived class to Another Derived Class
class child3 extends child2{
  // This is method
  def method: Unit = {

    println("gk details " + name + "," + age + "," + ph)
  }
}
object test4{

  def main(args: Array[String]): Unit = {
  //Here i am inititating the class into object
  val obj = new child3
  // calling the method inside the class
    obj.method
  }
}

