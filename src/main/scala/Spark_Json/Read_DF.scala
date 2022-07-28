package Spark_Json

import org.apache.spark.sql.functions.col
import org.apache.spark.sql.types.IntegerType

trait Read_DF extends spark_session {
  val df = spark.read.options(Map("inferSchema"->"true","header"->"true","delimiter"->",")).format("csv").load("C:\\Users\\GK\\IdeaProjects\\BigData\\src\\main\\resources\\covid_19_india.csv")
  println("\n -----------------> Successfully read DataFrame")
}
trait Convert_Str_Int extends Read_DF { //Here I am converting the string into Integer

  val df2 = df.withColumn("ConfirmedIndianNational",col("ConfirmedIndianNational").cast(IntegerType).as("ConfirmedIndianNational"))
    .withColumn("ConfirmedForeignNational",col("ConfirmedForeignNational").cast(IntegerType))
    .withColumn("State/UnionTerritory",col("State/UnionTerritory").as("StateUnionTerritory"))
  println("\n This is the Schema after changing the column types :")
  df2.printSchema() // To see the schema of the dataframe
  df2.rdd.getNumPartitions // Here I am getting the number of partitions

}

trait display extends Convert_Str_Int{
  def method: Unit ={
    df2.show(100,false)
  }
  def method2: Unit = {
    df2.show(100,false)
  }
}

trait partation_by extends display {


}
