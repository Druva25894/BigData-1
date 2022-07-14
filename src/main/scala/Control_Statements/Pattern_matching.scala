package Control_Statements

import scala.collection.immutable.ListSet

object Pattern_matching {
  def main(args: Array[String]): Unit = {
    println(test(1))
  }
def test(x:Int):String = x match{

    case 0 => "this is first match"
    case 1 => "this is second match"
    case 3 => "this is third match"
  }
}


object pattern_matching{
  def main(args: Array[String]): Unit ={
        println(j("D"))
  }
  def j(X:String):String = X match {

    case "gk" => "this is krishna"
    case "D" => "this is druva kumar"
    case "m" => "this is malli karjuna"
    case "s" => "this is sandeep"
    case _ => "no one match"

  }
}


object pattern_match{
  def main(args: Array[String]): Unit = {
    println(b(2))
  }
  def b(x:Int):String = x match {
    case 2 => "int method"
    case 3 => "gk"
  }
}



