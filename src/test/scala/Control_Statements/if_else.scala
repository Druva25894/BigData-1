package Control_Statements

object if_else extends App {
println("\n------------------If Condition------------------")
//If condition satisfies the body will execute
  var a = 50

  if (a > 30){
    println(s"$a is greater than 30")
  }

println("\n------------------ If Else --------------------")

  //If condition not satisfies then the else part will execute

  var a1 = 50
  var b1 =25

  if (b1 > a1)
    {
      println(s"$b1 is greater than $a1")
    }
  else {
    println(s"$a1 is greater than $b1")
  }

  println("\n------------------------------------------")
  var a2 = "malli"
  var b2 = "gk"

  if (a2 == "gk")
    {
      println(s"$a2 is taller than $b2")
    }
  else
    {
      println(s"$b2 is taller than $a2")
    }


println("\n------------- Nested If Else --------------")

  var a3 = 60
  var b3 = 70
  var c3 = 50

  if(a3 > b3)
    {
      if(a3 > c3)
        {
          println(s"$a3 is greater than $c3")
        }
        else
        {
          println(s"$c3 is greater than $a3")
        }
    }
  else
    {
      if (b3 > c3)
        {
          println(s"$b3 is greater than $c3")
        }
        else
        {
          println(s"$c3 is bigger")
        }
    }

println("\n------------------------ Example2------------------")

    var x = 1
    var y = 2
    var z = 3

    if(x < y)
      {
        if(x > z)
          {
            println(s"$x is greater than $z")
          }
          else
          {
            println(s"$z is greater than $x")
          }
      }
    else
      {
        if(y > z)
          {
            println(s"$y is greater than $z")
          }
          else
          {
            println(s" $z is bigger")
          }
      }

println("\n------------------------ If_else if ----------------")
val g = 10

  if(g == 20)
    {
      println(s" value is $g ")
    }
  else if(g == 40)
    {
      println(s"vlaue is $g")
    }
  else if(g == 10)
    {
      println(s"value is $g")

    }
  else
    {
      println("no match found")
    }







}
