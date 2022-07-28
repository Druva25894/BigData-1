package singleton_and_companion_example
/**
 * whenever the classname and objectname is same we can consider it as a companion object.
 *
 *They can share the private variables of each other and also no need to instantiate
  a object we can directly use it
 *
 *
 */


class companion_object {        // companion class
  Companion_object.func()
                               //non_companion_object.function1()

}

object Companion_object { // companion object

  var a = "apple"
  var b = "banana"

  private def fun(): Unit ={
    println(a+" "+b)
  }
}
object final_object{
  def main(args: Array[String]): Unit = {
    val ex = new companion_object
  }

  object non_companion_object{
    var a = "cat"
    var d = "dog"

    def function1(): Unit ={
      println(a+" "+d)
    }
  }







}

