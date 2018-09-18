package com.afftracker.app
import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.routing.HttpRouter
import com.afftracker.controller.TrafficSourceController
import com.afftracker.provider.{RepositoryProvider, ServiceProvider}

object AfftrackerApp extends AfftrackerServer

class AfftrackerServer extends HttpServer {
  override val modules = Seq(
    ServiceProvider,
    RepositoryProvider
  )
  override def configureHttp(router: HttpRouter) {
    router.add[TrafficSourceController]
  }
}