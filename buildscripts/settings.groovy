/**
 * Jenkins 2.0 Buildfile
 **/

/**
 * Build parameters, must be adjusted when forked!
 **/
dockerImageName = 'blacklabelops/java'
dockerTestCommandsJDK =
["java -version",
 "javac -version",
 "which java"] as String[]
dockerTestCommandsJRE =
 ["java -version",
  "which java"] as String[]
dockerRepositories = [["","Dockerhub","DockerhubEmail"]] as String[][]

oracle_6_java_major_version = "6"
oracle_6_java_update_version = "45"
oracle_6_java_build_number = "06"

oracle_7_java_major_version = "7"
oracle_7_java_update_version = "80"
oracle_7_java_build_number = "15"

oracle_8_java_major_version = "8"
oracle_8_java_update_version = "131"
oracle_8_java_build_number = "11"
oracle_8_java_hash="d54c1d3a095b4ff2b6607d096fa80163"

openjdk_8_java_major_version = "8"
openjdk_8_java_update_version = "131"
openjdk_8_java_build_number = "11-r1"

openjdk_7_java_major_version = "7"
openjdk_7_java_update_version = "121"
openjdk_7_java_build_number = "2.6.8-r0"

return this;
