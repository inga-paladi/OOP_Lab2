#!/bin/bash

javac -d classes *.java
pushd classes &> /dev/null
java Restaurant
popd &> /dev/null
