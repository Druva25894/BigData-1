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

  val b = BigInt(1234567890222222L)
  def method: Unit = {

    println("gk details: "+name+","+age+","+","+place+","+b)

  }
}
object test2{
  def main(args:Array[String]):Unit ={
    val obj = new Drived_class
    obj.method

  }
}


//BigInt is Not Working
// A) To use Bigint we should Mention L after the

