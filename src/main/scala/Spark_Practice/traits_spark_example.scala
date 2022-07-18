/*
package Spark_Practice

import Spark_Practice.df_test.df
import org.apache.spark.sql.SparkSession

trait parent_1{
  def read_df(): Unit ={
    val spark = SparkSession.builder()
      .master("local")
      .appName("workerDF")
      .getOrCreate()

    val df = spark.read.option("header","true").option("inferSchema","true").option("delimiter",",").format("csv").load("D:\\BigData\\dummyfiles\\CSV\\annual.csv")

  }
}
trait child_2{
  def distinct_df()
}
trait child_3{
  def display_df()
}
class traits_spark_example extends parent_1 with child_2 with child_3 {

  def distinct_df: Unit ={
    val dist_df = df.distinct().show()
  }
  def display_df: Unit ={
  }
}
object trail{
  def main(args: Array[String]): Unit = {
    val out = new traits_spark_example
    out.read_df
    out.display_df
    out.distinct_df
  }
}*/
