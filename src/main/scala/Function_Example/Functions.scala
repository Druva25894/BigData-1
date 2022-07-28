package Function_Example

//Syntax of function :- def functionName(parameters : typeofparameters) : returntypeoffunction = {
//                          statements to be executed
//                          }

/* 1) You can create function by using def keyword.You must mention return type of parameters while defining function and
*     return type of a function is optional. If you don't specify return type of a function, default return type is Unit.
*
* 2) You can create function with or without = (equal) operator. If you use it, function will return value.
*    If you don't use it, your function will not return anything and will work like subroutine.
*
*/


 // Without using = operator

  object fun_exp{
    def main(args: Array[String]){
      function_example() // here I am calling a function
    }
    def function_example(): Unit ={
      println("this is a sample function") // Here I am define the function
    }
  }

// With using = operator

object fun_exp2{
  def main(args:Array[String]): Unit ={
    var result = fun_equalto() // Here I am using = operator
    println(result)
  }
  def fun_equalto()={ // In this method I am using the = operator
    var a = 15
    a
  }
}

// Parameterized Function Example

/**
 * when using parameterized function you must mention type of parameters
 * explicitly otherwise compiler throws an error and your code fails to compile.
 *
 */

object parameter_fun{
  def main(args: Array[String]): Unit = {
    parameter_exp(10,10) // Here are the parameters I am passing
  }
  def parameter_exp(i: Int, i1: Int): Unit ={ //Here I am passing type of parameters explicitly.
    var a = i + i1
    println(a)
  }
}

// Scala Recursion Function

/**
 * In scala, you can create recursive functions also. Be careful while using recursive function.
 * There must be a base condition to terminate program safely.
 */

object recursion_fun {
  def main(args: Array[String]) = {
    var result = functionExample(15,2)
    println(result)
  }
  def functionExample(a:Int, b:Int):Int = {
    if(b == 0)          // Base condition
      0
    else
      a+functionExample(a,b-1)                          //To be clarified.?
  }
}

//Scala Function Parameter example with default value
object parameter_default{
  def main(args: Array[String]): Unit = {
    var result = parameter(10,20)
    var result1 = parameter(10)
    var result2 = parameter()
    println(result+"\n"+result1+"\n"+result2)
  }
  def parameter(a:Int=0,b:Int=0):Int={
  a+b
  }
}



