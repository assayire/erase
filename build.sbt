lazy val erase =
  project
    .in(file("."))
    .settings(
      name         := "erase",
      scalaVersion := "2.12.20",
      scalacOptions ++=
        "-encoding" ::
          "UTF-8" ::
          "-deprecation" ::
          "-feature" ::
          "-Ypartial-unification" ::
          "-Ywarn-adapted-args" ::
          "-Xlint" ::
          "-Xfatal-warnings" ::
          "-Xfuture" ::
          "-unchecked" ::
          "-Ywarn-dead-code" ::
          "-Ywarn-numeric-widen" ::
          "-Ywarn-unused" ::
          "-Wconf:src=src_managed/.*:s" ::
          "-Wconf:src=target/.*:s" ::
          "-Xsource:3" ::
          Nil
    )
