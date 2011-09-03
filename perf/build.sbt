// project name
name := "Numeric Performance Test"

// shrug?
version := "0.1"

// hide backup files
defaultExcludes ~= (filter => filter || "*~")

scalacOptions += "-optimise"

// any of these work, although 2.9.1 performs the best
//scalaVersion := "2.8.1
//scalaVersion := "2.9.0-1"
scalaVersion := "2.9.1"
