organization := "com.example"

name := "sltc"

version := "1.0"

scalaVersion := "2.9.0-1"

seq(webSettings :_*)

pollInterval := 300

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.0.0-SNAPSHOT",
  "org.scalatra" %% "scalatra-scalate" % "2.0.0-SNAPSHOT",
  "org.fusesource.scalamd" % "scalamd" % "1.5", // % runtime,
  "org.mortbay.jetty" % "jetty" % "6.1.22" % "jetty",
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "com.mongodb.casbah" %% "casbah" % "2.1.5.0",
  "org.slf4j" % "slf4j-simple" % "1.6.1" % "runtime",
  "com.novus" %% "salat-core" % "0.0.8-SNAPSHOT",
  "joda-time" % "joda-time" % "1.6",
  "org.scala-tools.time" % "time_2.8.0" % "0.2",
  "org.scala-tools.testing" %% "scalacheck" % "1.9",
  "org.scala-tools.testing" % "test-interface" % "0.5",
  //"org.specs2" %% "specs2-scalaz-core" % "6.0.RC2",
  "org.specs2" %% "specs2" % "1.5"
  )

resolvers ++= Seq(
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
  "repo.novus rels" at "http://repo.novus.com/releases/",
  "repo.novus snaps" at "http://repo.novus.com/snapshots/"
)
