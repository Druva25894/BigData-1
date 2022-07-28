package Control_Statements

import scala.collection.immutable.ListSet
import scala.util.control.Breaks.{break, breakable}

object Breakable_Break extends App {

  breakable {
    for (i <- 1 to 10) {
      println(i)
      if (i == 5)
        break

    }

  }
var num = 0
var a = List("gk","krishna")
breakable{
  for(num <- a){
    println(num)
    if(num == "krishna")
      break();

  }

}


  var b = ListSet("gk",1,"krishna")
  breakable{
    for(i <- b){
      println(i)
      if(i == 1)
        break();
    }
  }
























}