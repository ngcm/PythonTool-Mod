#! /bin/bash

echo ---------------------------------
echo ----- STARTING INSTALLATION -----
echo ---------------------------------

# Download Forge 1.8 from the internet
curl -o forge-18.zip http://files.minecraftforge.net/maven/net/minecraftforge/forge/1.8-11.14.4.1563/forge-1.8-11.14.4.1563-mdk.zip

# Create a directory to host Forge files and decompress the .zip file there
unzip forge-18.zip -d forge-18

# Setup workspace, may take a while
cd forge-18
./gradlew setupDecompWorkspace --refresh-dependencies
cd ..

# Move the mod code files to the newly created Forge folder
mv build.gradle forge-18/
mv gradle forge-18/gradle/
mv gradlew forge-18/
mv gradlew.bat forge-18/
rm -r forge-18/src
mv src forge-18/

echo ---------------------------------
echo ----- FINISHED INSTALLATION -----
echo ---------------------------------
