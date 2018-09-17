package com.afftracker.provider

import com.afftracker.service.TrafficSourceService
import com.google.inject.{Provides, Singleton}
import com.twitter.inject.TwitterModule

object ServiceProvider extends TwitterModule{

  @Singleton
  @Provides
  def TrafficeSourceServiceProvider: TrafficSourceService = {
    new TrafficSourceService
  }

}
