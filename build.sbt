lazy val root = (project in file(".")).
  settings(
    organization := "io.gate",
    name := "gate-api",
    version := "6.94.2",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "com.squareup.okhttp3" % "okhttp" % "4.9.3",
      "com.squareup.okhttp3" % "logging-interceptor" % "4.9.3",
      "com.google.code.gson" % "gson" % "2.10",
      "org.apache.commons" % "commons-lang3" % "3.10",
      "commons-codec" % "commons-codec" % "1.14",
      "io.gsonfire" % "gson-fire" % "1.8.3" % "compile",
      "javax.annotation" % "javax.annotation-api" % "1.3.2" % "compile",
      "com.google.code.findbugs" % "jsr305" % "3.0.2" % "compile",
      "junit" % "junit" % "4.13" % "test",
      "com.novocode" % "junit-interface" % "0.10" % "test"
    )
  )
