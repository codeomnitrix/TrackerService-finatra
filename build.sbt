name := "TrackerService"

version := "0.1"

scalaVersion := "2.12.6"

lazy val versions = new {
  val finatra = "18.8.0"
  val logback = "1.1.3"
}

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  "Twitter Maven" at "https://maven.twttr.com"
)

libraryDependencies += "com.twitter" %% "finatra-http" % versions.finatra