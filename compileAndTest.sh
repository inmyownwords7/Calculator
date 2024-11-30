#!/bin/bash

echo "Compiling Maven dependencies"

mvn compile

echo "Testing Results"
mvn test

echo "Done!"