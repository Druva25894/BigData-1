package Spark_Practice

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.catalyst.expressions.Year

class Spark_Traits {
 val spark = SparkSession.builder()
   .master("local")
   .appName("workerDF")
   .getOrCreate()

  val df = spark.read.option("header","true").option("inferSchema","true").option("delimiter",",").format("csv").load("D:\\BigData\\dummyfiles\\CSV\\annual.csv")
}
class Spark_Traits2 extends Spark_Traits {

  def spark2(): Unit ={
    val df2 = df.dropDuplicates("Year")
    df2.show(false)
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