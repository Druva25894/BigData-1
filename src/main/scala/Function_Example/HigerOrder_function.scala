package Function_Example


//passing a function as parameter in a function
// Here I am multiple the two values.


object HigerOrder_function {
  def main(args: Array[String]): Unit = {
    high_function(10,valb) // passing a function as parameter
  }
  def high_function(a: Int, b: Int=>AnyVal): Unit ={
    println(b(a)) // calling a function
  }
  def valb(a:Int):Int ={  // function to multiply
    a*2 // optional a/2 a+2 a-2
  }
}


// function composition

object higerOrder{
  def main(args: Array[String]): Unit = {
    var compostion_functon = multby_A(add_A(100)) // function composition
    println(compostion_functon)
  }
  def add_A(A: Int):Int = {
   A+2
  }
  def multby_A(A: Int): Int ={
    A*2
  }
}


