package com.afftracker.controller

import com.afftracker.models.TrafficSource
import com.afftracker.service.TrafficSourceService
import com.google.inject.Inject
import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller
import com.twitter.util.Future

case class Pong(message: String)

class TrafficSourceController @Inject() (trafficSourceService: TrafficSourceService)  extends Controller {
  get("/hi") {
    request: Request => {
      info("hi")
      Pong("Hello " + request.params.getOrElse("name", "unnamed"))
    }
  }
  prefix("/traffic-source") {
    post(route = "/create") {
      trafficSource: TrafficSource => {

      }
    }

    /**
      * Get the traffic source with given id
      */
    get(route = "/view/:id") {
      request: Request => {
        Future.value(trafficSourceService.getTrafficSource(request.params("id")))
      }
    }
  }

}
