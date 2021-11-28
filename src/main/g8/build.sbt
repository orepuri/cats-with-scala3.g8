val scala3Version = "$scala3Version$"
val catsVersion = "2.7.0"
val catsEffectVersion = "3.3.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "cats-with-scala3-simple",
    version := "0.0.1",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core"   % catsVersion,
      "org.typelevel" %% "cats-effect" % catsEffectVersion
    )
  )
