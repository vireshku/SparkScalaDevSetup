package com.tech.vir.entry

import com.tech.vir.session.DemoSparkSession

object MainEntry {
  
  def main(args: Array[String]): Unit = {
    
    println("Starting the entry point --------------->")
    
    val spark = DemoSparkSession.spark
    import spark.implicits._
    val dataframe = Seq((8, "bat"),(64, "mouse"), (-27, "horse")).toDF("Number", "Word")
    dataframe.show()
    
    println("Finishing the entry point --------------->")
  }
}