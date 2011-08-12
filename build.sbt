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
  "com.novus" %% "salat-core" % "0.0.8-SNAPSHOT"
)

resolvers ++= Seq(
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
  "repo.novus rels" at "http://repo.novus.com/releases/",
  "repo.novus snaps" at "http://repo.novus.com/snapshots/"
)
