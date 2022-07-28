package Spark_Json

import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.SparkSession

trait spark_session {
  val spark =SparkSession.builder().appName("sparksession").master("local").getOrCreate()
  Logger.getLogger("org").setLevel(Level.ERROR)
  println(" \n -----------------> sparksession created successfully ")
}


