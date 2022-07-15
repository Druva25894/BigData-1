package OOPS_PRACTICE


// We use this abstract class whenever third party tools need access that time we use abstract class
//Abstract class to hide the method in the class which is not able to see for endusers
//we cant instantiate the abstract class

abstract class example {
  var name = "kridhna"
  var age = 25
def method()

}
class example2() extends example {

  def method: Unit ={
    println( " gk details : " +name+age)
  }
}
object test11{
  def main(args:Array[String]):Unit = {
    val objjj = new example2
  objjj.method
}

}