package Spark_Practice

import org.apache.spark.sql.SparkSession

class Spark_Traits {
 val spark = SparkSession.builder()
   .master("local")
   .appName("workerDF")
   .getOrCreate()

  val df = spark.read.textFile("C:\\Users\\GK\\Desktop\\Spark_trait.txt")
  df.show()
}
class Spark_Traits2 extends Spark_Traits {

 /* val spark2 = SparkSession.builder()
    .master("local")
    .appName("workerDF")
    .getOrCreate()*/
def spark2(): Unit ={
  val df2 = spark.read.textFile("C:\\Users\\GK\\Desktop\\Spark_trait.txt")
  println(df2.count())

  }
}


object df_test extends Spark_Traits2 {
  def main(args: Array[String]): Unit = {
    val df = new Spark_Traits
    val df2 = new Spark_Traits2
    df.spark
    df2.spark2
  }
}