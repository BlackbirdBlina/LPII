#!/bin/bash
javac -d bin -cp src src/Main.java src/br/universidade/ecommerce/*.java

java -cp bin Main