package com.first_program

import org.apache.spark.sql.SparkSession

object Hello_World {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("first_app")
      .master("local")
      .getOrCreate()

    println("helloworld")
    
    This is to Practice 



  }

}
