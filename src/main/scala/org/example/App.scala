package org.example

import org.apache.spark.sql.SparkSession
import org.slf4j.{Logger, LoggerFactory}

/**
 * @author ${user.name}
 */
object App {

  def foo(x: Array[String]) = {
    x.foldLeft("")((a, b) => a + b)

  }

  def main(args: Array[String]) {
    val logger: Logger = LoggerFactory.getLogger(this.getClass)
    logger.info("Start Spark Test execution")
    logger.info("Hello World from Spark!")
    logger.info("concat arguments = " + foo(args))
    val spark: SparkSession = SparkSession.builder().appName("HelloWorld from Spark").getOrCreate()

    val testDF = spark.range(1, 100).toDF("columnId")
    testDF.show()
    logger.info("Finished Spark Test execution")

  }
}
