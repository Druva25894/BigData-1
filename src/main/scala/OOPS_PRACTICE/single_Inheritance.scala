package OOPS_PRACTICE


// This is called Base Class Or Patent Class
class single_Inheritance {

  var name = "Krishna"
  var age = 25
  var place = "nellore"


}
// This is called derived class
// Using extends i can able to inheritate the Base Class to Derived Class
class Drived_class extends single_Inheritance {

  var ph: BigInt = 12345678901

  def method: Unit = {

    println("gk details: "+name+","+age+","+","+place+","+ph)

  }
}
object test2{
  def main(args:Array[String]):Unit ={
    val obj = new Drived_class
    obj.method

  }
}


//BigInt is Not Working