package Control_Statements

object Loops extends App {

  var x = 1;

  // Exit when x becomes greater than 4
  while (x <= 4) {
    //println("Value of x: " + x);

    // Increment the value of x for
    // next iteration
    x = x + 1;
  }

    println("\n---------- While loop itteration -----------")

    var a = 10

    while(a > 5)
      {
        //println(a)
        a =  a - 1
      }

    println("\n------------ while loop iteration in descending order  ----------")

    var b = 10

    while(b > 0)
      {
        //println(b)
        b = b -1
      }

    println("\n------------------- while loop iterating  negative values in ascending order -------------")


    var k = 0
    while(k >= -10)
      {
        //println(k)
        k = k - 1
      }

    println("\n------------- while loop iterating  negative values in decending order ------------")
    var g = -10
    while(g < 0  )
    {
     // println(g)
      g = g + 1
    }


    println("\n------------- while loop with using string in list --------------------------------")

    var h : List[String] = List("giri","koteswari","gk","bhavani")
    var j = 0;

    while(j < h.length)
    {
      if(h(j) == "gk")
      {
      println(j)
      j = j + 1
      }
    }







}

