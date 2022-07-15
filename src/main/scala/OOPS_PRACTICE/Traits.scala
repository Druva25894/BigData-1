package OOPS_PRACTICE

// Scala program to illustrate the
// multiple inheritance using traits

// Trait 1
trait Geeks1
{
  def method1()
}

// Trait 2
trait Geeks2
{
  def method2()
}

// Class that implement both Geeks1 and Geeks2 traits
class GFG extends Geeks1 with Geeks2
{

  // method1 from Geeks1
  def method1()
  {
    println("Trait 1");
  }

  // method2 from Geeks2
  def method2()
  {
    println("Trait 2");
  }
}
object Main
{
  // Driver code
  def main(args: Array[String])
  {

    // Creating object of GFG class
    var obj = new GFG();
    obj.method1();
    obj.method2();
  }
}

