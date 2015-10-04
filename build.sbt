name := "InterviewProject"

version := "1.0"

scalacOptions in Compile ++= Seq("-Xmax-classfile-name", "128")

javaOptions ++= Seq("-Xms512M", "-Xmx2048M", "-XX:MaxPermSize=2048M", "-XX:+CMSClassUnloadingEnabled")

scalaVersion := "2.11.0"

resolvers += "maven" at "http://maven.apache.org"

libraryDependencies ++= Seq(
  "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0",
  "org.scalatest" %% "scalatest" % "2.2.4",
  "junit" % "junit" % "4.12"
)