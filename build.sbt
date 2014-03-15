name := "sanma"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "com.typesafe.akka" %% "akka-actor" % "2.3.0",
  "org.slf4j" % "slf4j-simple" % "[1.7,)",
  "com.h2database" % "h2" % "[1.3,)",
  "org.scalikejdbc" %% "scalikejdbc" % "1.7.4",
  "org.scalikejdbc" %% "scalikejdbc-interpolation" % "1.7.4"
)

play.Project.playScalaSettings
