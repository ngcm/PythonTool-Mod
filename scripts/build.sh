#! /bin/bash

echo ---------------------------------
echo --------- STARTING BUILD --------
echo ---------------------------------

# Build
cd forge-18
chmod +x gradlew
./gradlew build

echo ---------------------------------
echo --------- FINISHED BUILD --------
echo ---------------------------------