import sbt._
import Keys._

object SoqlTypes {
  lazy val settings: Seq[Setting[_]] = BuildSettings.projectSettings() ++ Seq(
    libraryDependencies ++=
      Seq(
        // Only used by serialization
        "com.google.guava"    % "guava"                    % "18.0",
        "com.google.protobuf" % "protobuf-java"            % "2.4.1" % "optional",
        "com.rojoma"         %% "rojoma-json-v3"           % "[3.0.0,4.0.0)",
        "com.socrata"        %% "socrata-thirdparty-utils" % "4.0.1",
        "com.vividsolutions"  % "jts"                      % "1.13",
        "commons-io"          % "commons-io"               % "2.5",
        "joda-time"           % "joda-time"                % "2.1",
        "org.bouncycastle"    % "bcprov-jdk15on"           % "1.48",
        "org.joda"            % "joda-convert"             % "1.2",
        "org.scalacheck"     %% "scalacheck"               % "1.12.2" % "test"
      )
  )
}
