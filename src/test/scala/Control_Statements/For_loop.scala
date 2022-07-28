package Control_Statements

object For_loop extends App {

  for (a <- 0 to 10 ){
    println(a)
  }

for (b <- 0 until 10 )
  {
  println(b)
  }

  for(c <- 1 to 2;d <- 1 until 10)
    {
      println("C : " +c)
      println("D : " +d)
    }

  //var rank = 3
  val ranklist = List(1,2,3,4,5,6,7,8,9)
  for( rank <- ranklist)
    {
      println(rank)
  }


}
