package list_practice

import org.apache.spark.sql.catalyst.expressions.SizeBasedWindowFunction.n
import org.apache.spark.sql.functions

import Array._
import scala.+:
import scala.xml.NodeSeq.Empty.\


// Array is mutable and it is homogeneous must be same datatype.

object Array_practice {
  def main(args: Array[String]) {

    var name: Array[String] = Array("gk","krishna")
    var name1 : Array[String] = Array("nellore")
    print(name(0))


    println("\n---------------- weekdays -----------------")
    // Array print in sequence \n
    var array_rows : Array[String] = Array("sunday","monday","tuesday","wednesday","thursday","friday","saturday")
    var array_col : Array[String] = Array("days")

    for(x <-array_rows)
      {
        println(x)
      }


// updating an element in array

    var array_updt : Array[String] = Array("sunday","monday","tuesday","wednesday","thursday","friday","saturday")

    array_updt(0)="funday"
     println("\n----------------updating item in Array-------------------")

    for(x <- array_updt)
    {
        println(x)
      }


// Adding elements in an array
  println("\n-----------------------Adding elements-----------------------")

    var array_addele = new Array[String](5)
    array_addele(0)="gk"
    array_addele(1)="gk1"
    array_addele(2)="gk2"
    array_addele(3)="gk3"
    array_addele(4)="gk4"

    for(x <- array_addele)
      {
        println(x)
      }

   println("\n--------------print lenth--------------")
//print the length of the array
    println(array_addele.length)

    println("\n--------------print index-------------")
//print the index of the array
    for (i <- 0 to (array_addele.length -1))
    {

      println(i)

    }

    println("\n-----------------------concatnetate---------------------")
// concat the array
    var array1: Array[Int] = Array(1,2,3,4,5)
    var array2: Array[Int] = Array(6,7,8,9,10)
    var array3 = concat(array1,array2)

    for(x <-array3)
    {
      println(x)
    }


  println("\n-------------------- multidimension -----------------------------")
//multi

    val rows = 3
    val cols = 4

    // Declaring Multidimension array
    val names = Array.ofDim[String](rows, cols)

    // Allocating values
    names(0)(0) = "gfg"
    names(0)(1) = "Geeks"
    names(0)(2) = "GeeksQuize"
    names(0)(3) = "spark "
    names(1)(0) = "GeeksForGeeks"
    names(1)(1) = "Employee"
    names(1)(2) = "Author"
    names(1)(3) = "scala"
    names(2)(0) = "test"
    names(2)(1) = "test2"
    names(2)(2) = "test3"
    names(2)(3) = "test4"
      for
    {
      i <- 0 until rows
      j <- 0 until cols
    }

    // Printing values
      println(s"($i)($j) = ${names(i)(j)}")

println("\n--------------------- append array -------------------------")

  //append array to append 1 value (:+)

    var a :Array[Int] = Array(1,2,3,4,5)
    var b = a :+ 6

    for(x <- b){
      println(x)
    }

println("\n------------------------append multiple values-----------------")
    //appending multiple values to string

    var c = b ++ Array(7,8)
    for(i <- c)
    {
      println(i)
    }

println("\n----------------------prepanding single value------------------")

    var d = 9 +: c
    for(e <- d)
      {
        println(e)
      }

println("\n---------------------prepanding multiple values---------------")

    var e = Array(10,11) ++: d
    for(f <- e){
      println(f)
    }



    }

}

