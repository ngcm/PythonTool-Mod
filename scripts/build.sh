#! /bin/bash

echo ---------------------------------
echo --------- STARTING BUILD --------
echo ---------------------------------

# Build
cd forge
chmod +x gradlew
./gradlew build

echo ---------------------------------
echo --------- FINISHED BUILD --------
echo ---------------------------------