#!/usr/bin/env sh

set -e
# generate demo application
mkdir gateapi-demo-maven
cd gateapi-demo-maven
mvn archetype:generate \
    -DgroupId=io.gate.apidemo \
    -DartifactId=gateapi-demo \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DarchetypeVersion=1.4 \
    -DinteractiveMode=false
# remove generated source and test files
rm gateapi-demo/src/test/java/io/gate/apidemo/* gateapi-demo/src/main/java/io/gate/apidemo/*
# copy example application into source folder
cp ../example/*.java gateapi-demo/src/main/java/io/gate/apidemo
cp ../example/pom.xml gateapi-demo/

# build demo application
cd gateapi-demo
mvn clean compile package

echo 'run "java -jar gateapi-demo/target/gateapi-demo-1.0-SNAPSHOT.jar" for help'