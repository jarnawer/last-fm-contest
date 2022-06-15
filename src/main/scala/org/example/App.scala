package org.example


import org.apache.spark.sql.SparkSession
/**
 * @author ${user.name}
 */
object App {

  def foo(x : Array[String]) ={
    x.foldLeft("")((a,b) => a + b)

  }
  
  def main(args : Array[String]) {
    println( "Hello World from Spark!" )
    println("concat arguments = " + foo(args))
    val spark:SparkSession = SparkSession.builder().appName("HelloWorld from Spark").getOrCreate()
  }
}
