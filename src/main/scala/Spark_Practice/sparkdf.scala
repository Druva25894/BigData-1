package Spark_Practice

import org.apache.spark.sql.SparkSession

object sparkdf {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("DF_reader")
      .master("local")
      .getOrCreate()

    val df = spark.read.option("header","true").option("inferSchema","true").option("delimeter",",").textFile("C:\\Users\\GK\\Desktop\\Spark_trait.txt")
    println(df.count())
  }

}
