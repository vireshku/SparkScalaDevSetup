package com.tech.vir.entry

import com.tech.vir.session.DemoSparkSession

object MainEntry {
  
  def main(args: Array[String]): Unit = {
    
    println("Starting the entry point --------------->")
    
    val spark = DemoSparkSession.spark
    import spark.implicits._
    
    // Employee Data
    val empDF = Seq((8, "John" , 1),(64, "Mike", 2), (27, "Garner", 1)).toDF("EmpId", "EmpName" , "DepId")
    empDF.show()
    
    // Department Data
    val depDF = Seq((1,"IT"),(2,"ACCOUNTS")).toDF("DepId" , "DepName")
    depDF.show()
    
    // Joined Data
    val resultant = empDF.join(depDF, "DepId").select($"EmpName", $"DepName")
    resultant.show()
    
    println("Finishing the entry point --------------->")
  }
}