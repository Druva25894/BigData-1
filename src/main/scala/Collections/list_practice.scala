package Collections

import scala.collection.immutable._

import scala.collection.mutable._


/*This is to print list by Calling the list(1) to call Specific index in the list.
list is immutable and (Homogenius -> all the items in the list must be in one datatype only)
Appending is not possible in the list. */

object list_test {
  def main(args: Array[String]): Unit = {
println("\n--------------------- list --------------------------")
    val lst : List[Int] = List(1,2,3,4,5,6,7,8)
    val lst2: List[String] = List("gk","krishna","druva","malli","sandeep")
    val lst3 = ListBuffer.concat(lst,lst2)


       println(lst3)
       println(lst)
       println(lst2(2))



  }
}

//Creating a empty list

object emp_list{
  def main(args: Array[String]): Unit = {
println("\n------------------- creating empty array ----------------------")
    val emp_lst: List[Nothing] =List()

    println(emp_lst)
  }
}

//creating fill method in list
object lst_fill {
  def main(args: Array[String]): Unit = {
    println("\n------------------ fill the items using function-----------")
    val lst_fill : List[String] = List.fill(3)("gk")

    println(lst_fill)
  }
}

/*creating a list Buffer using list
list_buffer is mutable and we append the items in the list buffer and this is also the homogenius*/


object Lst_buffer {
  def main(args: Array[String]): Unit = {
println("\n---------------------- ListBuffer ------------------------------")
    var lst_buffer: ListBuffer[String] = ListBuffer("gk",
    "krishna")

    println(lst_buffer(1))

  //Type 2 of ListBuffer
    var name: ListBuffer[String] = ListBuffer()

    name += "gk"
    name += "krishna"
    name += "druva"

    println(name(1))

  }
}


object collections {
  def main(args: Array[String]): Unit = {

    println("\n------------------- List Set ---------------------------")
/*ListSet is immutable and it is heterogeneous
it does not print the duplicate items in output
it prints the items reverse in order    */

    var lst_set = ListSet("gk","gk1","gk1","gk3",1)
    //print in one row
    println(lst_set)
    //print in new line
    for(x <- lst_set)
      {
        println(x)
      }

    





    }

}








