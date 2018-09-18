package com.afftracker.config

import org.mongodb.scala.MongoClient

object DatabaseConfig {
  val connectionString = "mongodb://localhost:27017/?maxPoolSize=30"
  var connection: MongoClient = null

  def getConnection: MongoClient = {
    if (connection == null)
      connection = MongoClient(connectionString)
    connection
  }
}
