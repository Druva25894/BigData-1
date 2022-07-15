package OOPS_PRACTICE

// In hierarchical Inheritance the parent class refers to Derived different classes
class Hierarchical_inheritance {
  var name = "krishna"
  var age = 25

}

// Here i can inherit the Base class to Child Class
class child_2 extends Hierarchical_inheritance{

  var place = "Andhra Pradesh"
  def method1: Unit ={
   println("gk : "+name+","+age+","+place)
  }
}

// Here i can inherit the Base Class to Child class
class child_3 extends Hierarchical_inheritance{
  var ph = 12345
  def method2: Unit = {
  println("gk : "+name+","+age+","+ph)
 }
}

// Here i can inherit the Base Class to Child Class
class child_4 extends Hierarchical_inheritance{

  def method3: Unit = {

  }
}

object test5{
  def main(args: Array[String]): Unit = {
    val obj = new child_2
    val obj2 = new child_3
    val obj3 = new child_4

    obj.method1
    obj2.method2
    obj3.method3

  }
}