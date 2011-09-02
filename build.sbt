// project name
name := "Numeric"

// shrug?
version := "0.1"

// test
libraryDependencies += "org.scalatest" % "scalatest_2.9.0" % "1.6.1"

// hide backup files
defaultExcludes ~= (filter => filter || "*~")

scalacOptions += "-optimise"

//scalaVersion := "2.8.1
//scalaVersion := "2.9.0-1"
scalaVersion := "2.9.1"

// Use the project version to determine the repository to publish to.
publishTo <<= version { (v: String) =>
  if(v endsWith "-SNAPSHOT")
    Some(ScalaToolsSnapshots)
  else
    Some(ScalaToolsReleases)
}
