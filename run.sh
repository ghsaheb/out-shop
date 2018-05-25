#!/bin/bash
cd src
javac -cp ../lib/sqlite-jdbc-3.8.11.2.jar:. *.java
java -cp ../lib/sqlite-jdbc-3.8.11.2.jar:. DatabaseSeeder
java -cp ../lib/sqlite-jdbc-3.8.11.2.jar:. Main