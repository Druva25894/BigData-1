
package test_program

class test_class {
  var name = "krishna"
  var place = "nellore"
  def show()
  {
  println("this is "+name+ " im from "+place);

 }
}
object test
{
  def main(args: Array[String])
   {
   var ob = new test_class();
    ob.show();
 }

 }
