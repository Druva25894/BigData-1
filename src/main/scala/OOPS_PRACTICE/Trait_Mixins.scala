package OOPS_PRACTICE


// Trait Mixin is used to mix classes and traits in one incremental class
// Here we have to keep in mind there is order to extends this: first we have to extend with abstract class after traits

trait mix_trait{
  def mix_method() // This is the abstract method i am not implementing here
}

abstract class mix_class{
  def mix_cls(): Unit ={ // This is the non-abstract method i am implementing the body here and it is optional to declare in class
                         // if u want to use the same method, add override before the implementation method in incremental class
    println("This is the non-abstract method")
  }
}

class Trait_Mixins extends mix_class  { // order to extend: first class after trait

  def mix_method(): Unit ={
    println("This is a trait in mix_class")
  }

}
object mix_obj{
  def main(args: Array[String]): Unit = { //Main method
    val mix_obj = new Trait_Mixins with mix_trait //Here i am instantiating the class into object and inheriting the trait to a particular object
    mix_obj.mix_method()
    mix_obj.mix_cls()
  }
}
