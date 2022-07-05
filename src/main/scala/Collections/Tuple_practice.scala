package Collections

object Tuple_practice extends App {

  /*Tuple is a collection of elements.
  Tuples are heterogeneous data structures, i.e., is they can store elements of different data types.
    A tuple is immutable, unlike an array in scala which is mutable.*/

  // this is tuple of type Tuple3[ Int, String, Boolean ]

  //val name = (15, "Chandan", true)


  /*Access element from tuple: Tuple elements can be accessed using an underscore syntax,
   method tup._i is used to access the ith element of the tuple.*/
println("\n------------- Tuple example -----------------")
  var tup_pra = (1,"gk",35,1.5)

  println(tup_pra._4)
  println(tup_pra._1)
  println(tup_pra._2)
  println(tup_pra._3)

println("\n--- declare variable (a,b,c)=(15,chandan,true)--")
//Here, in above example var (a, b, c)= (15, “chandan”, true) expression assign a = 15, b = “chandan”, c = true.
  var (a, b, c) = (15, "chandan", true)
  println(a)
  println(b)
  println(c)

println("\n------------------Tuple Iterator ------------- ")
// Iterator and prints the
var test = (1,2,3,4,5,6,7,8,9)

  test.productIterator.foreach(i => println(i))

println("\n--------- converting Tuple toString ----------")
  var test1 = (1,2,3,4,5)

  println(test1.toString)



println("\n---------swap the items int tuple ------------")
// The elements must be two in the Tuple to use swap

  var test3 = ("gk1", "gk2")

  println(test3.swap)











}
