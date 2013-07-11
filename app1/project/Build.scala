import sbt._
import Keys._

object App1Build extends Build {
  lazy val root = Project(id = "app1", base = file("."))
    .settings(
      organization := "testing",
      version := "1.0-SNAPSHOT",
      scalaVersion := "2.10.2"
    ).aggregate(foo)

  lazy val foo = Project(id = "foo", base = file("foo"))
    .settings(
      organization := "testing",
      version := "1.0-SNAPSHOT",
      scalaVersion := "2.10.2"
    )
}
