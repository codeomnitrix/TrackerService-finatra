package com.afftracker.repository

import com.afftracker.Constants
import com.afftracker.config.DatabaseConfig
import com.afftracker.exceptions.DatabaseException
import com.afftracker.models.TrafficSource
import org.mongodb.scala.{Document, FindObservable, Observer}
import org.mongodb.scala.model.Filters._

class TrafficSourceRepository {

  def getTrafficSource(trafficSourceId: String): TrafficSource = {
    DatabaseConfig.getConnection.
      getDatabase(Constants.AFF_TRACKER).
      getCollection(Constants.TRAFFIC_SOURCE).
      find(equal("_id", trafficSourceId)).subscribe(new Observer[Document] {
      override def onNext(result: Document): Unit = result

      override def onError(e: Throwable): Unit = throw new DatabaseException("TrafficSourceRepository.getTrafficSource", e)

      override def onComplete(): Unit = ???
    })
  }
}
