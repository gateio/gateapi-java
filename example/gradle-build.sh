#!/usr/bin/env sh

set -e
mkdir gateapi-demo-gradle
cd gateapi-demo-gradle
../gradlew init \
    --type java-application \
    --dsl groovy \
    --test-framework junit \
    --project-name gateapi-demo \
    --package io.gate.apidemo

# remove generated source and test files
rm src/test/java/io/gate/apidemo/* src/main/java/io/gate/apidemo/*
# copy example application into source folder
cp ../example/*.java src/main/java/io/gate/apidemo
cp ../example/build.gradle ./
../gradlew build

echo 'run "cd gateapi-demo-gradle && ./gradlew run " for help'
