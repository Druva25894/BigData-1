package OOPS_PRACTICE

trait Domestic {
   //This is the abstract method which means it does not any definition or implementation.
  def getName()

 //This is the Non-abstract Method which means we have define and implement the method.
  def getName1(): Unit ={
    println("This is the Animal")
  }
}
trait Domestic2{
 //This is a abstract and non defined method
  def getName2()
}


trait Domestic3{
  //i am creating a abstract method here as trait 3
  def getName4()
}

 class traits_practice extends Domestic with Domestic2 with Domestic3 {
// Here i am calling the abstract method
  def getName(): Unit ={
    println("This is a cow")
  }

// Here I am calling the Non-abstract method and overriding the method
  override def getName1(): Unit ={
    println("this is test")}


   // Here i am calling Domestic2 as another trait
   def getName2(): Unit ={
     println("this is another trait")
   }

   def getName4(): Unit ={
     println("this is the 4th trait")
   }

}
object trait_ex{
  def main(args:Array[String]):Unit={
    val obj = new traits_practice
    obj.getName()
    obj.getName1()
    obj.getName2()
    obj.getName4()
  }
}
