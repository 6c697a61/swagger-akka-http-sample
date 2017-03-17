name := "swagger-akka-http-sample"

scalaVersion := "2.12.1"

resolvers += Resolver.sonatypeRepo("releases")
resolvers += Resolver.sonatypeRepo("snapshots")

val akkaHttpVersion = "10.0.4"

libraryDependencies ++= Seq(
  "io.swagger" % "swagger-jaxrs" % "1.5.13",
  "com.github.swagger-akka-http" %% "swagger-akka-http" % "0.9.1",
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "ch.megard" %% "akka-http-cors" % "0.1.11",
  "org.slf4j" % "slf4j-simple" % "1.7.14"
)
