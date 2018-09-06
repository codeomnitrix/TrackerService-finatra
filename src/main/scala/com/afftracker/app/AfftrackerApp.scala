package com.afftracker.app
import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.routing.HttpRouter
import com.afftracker.controller.HelloWorldController

object AfftrackerApp extends AfftrackerServer

class AfftrackerServer extends HttpServer {
  override def configureHttp(router: HttpRouter) {
    router.add(new HelloWorldController)
  }
}