package test_program

class test_class {
  var name = 25
  var place = 91
  var sum = name+place
  def sh()
  {
    println("this is "+name+ " im from "+sum);
  }
}


class test_1 {
  var name1 = "malli"
  var name2 = "garimma"
  def love()
  {
    println(name1+ " bestfriend is "+name2);
  }
}


object test1
{
def main(args: Array[String])
{
var ob = new test_1();
ob.love();
 }
}



object test2
{
  def main(args: Array[String]): Unit =
  {
    var ob2 = new test_class();
    ob2.sh();
  }

}