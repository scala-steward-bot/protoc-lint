addSbtPlugin("com.thesamet" % "sbt-protoc" % "1.0.7")
libraryDependencies += "io.github.scalapb-json" %% System.getProperty("protoc-lint-artifact-id") % System.getProperty(
  "protoc-lint-version"
)
resolvers += Resolver.mavenLocal
