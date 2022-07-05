package Collections

class test_class1 {
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
  def friend()
  {
    println(name1+ " bestfriend is "+name2);
  }
}


object test1
{
  def main(args: Array[String])
  {
    var ob = new test_1();
    ob.friend();
  }
}



object test2
{
  def main(args: Array[String]): Unit =
  {
    var ob2 = new test_class1();
    ob2.sh();
  }

}
