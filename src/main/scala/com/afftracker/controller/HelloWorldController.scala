package com.afftracker.controller

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

case class Pong(message: String)

class HelloWorldController extends Controller {
  get("/hi") {
    request: Request => {
      info("hi")
      Pong("Hello " + request.params.getOrElse("name", "unnamed"))

    }
  }
}
