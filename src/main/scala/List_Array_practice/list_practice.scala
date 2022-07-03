package List_Array_practice

import java.nio.file.Files.list
import scala.collection.immutable._
import scala.collection.mutable.ListBuffer
import scala.io.Codec.fallbackSystemCodec.name


/*This is to print list by Calling the list(1) to call Specific index in the list.
list is immutable and (Homogenius -> all the items in the list must be in one datatype only)
Appending is not possible in the list. */

object list_test {
  def main(args: Array[String]): Unit = {
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
    val emp_lst: List[Nothing] =List()

    println(emp_lst)
  }
}

//creating fill method in list
object lst_fill {
  def main(args: Array[String]): Unit = {
    val lst_fill : List[String] = List.fill(3)("gk")

    println(lst_fill)
  }
}

/*creating a list Buffer using list
list_buffer is mutable and we append the items in the list buffer and this is also the homogenius*/


object Lst_buffer {
  def main(args: Array[String]): Unit = {
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


