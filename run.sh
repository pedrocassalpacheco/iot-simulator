#!/bin/bash

# Run five instances of the Java program
for i in {1..5}
do
   java -jar  target/simulator-1.0-SNAPSHOT-jar-with-dependencies.jar&
done

# Wait for all instances to finish

