ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "2.13.1"

lazy val root = (project in file("."))
  .aggregate(foo, bar)
  .settings(name := "scalatest-example")

lazy val foo = (project in file("foo")).settings()
lazy val bar = (project in file("bar")).settings()

ThisBuild / libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test
