#! /bin/bash

echo ---------------------------------
echo ----- STARTING INSTALLATION -----
echo ---------------------------------

# Download Forge 1.8 from the internet
curl -o forge.zip http://files.minecraftforge.net/maven/net/minecraftforge/forge/1.9.4-12.17.0.1976/forge-1.9.4-12.17.0.1976-mdk.zip

# Create a directory to host Forge files and decompress the .zip file there
unzip forge.zip -d forge

# Setup workspace, may take a while
cd forge
./gradlew setupDecompWorkspace --refresh-dependencies
cd ..

# Move the mod code files to the newly created Forge folder
mv build.gradle forge/
mv gradle forge/gradle/
mv gradlew forge/
mv gradlew.bat forge/
rm -r forge/src
mv src forge/

echo ---------------------------------
echo ----- FINISHED INSTALLATION -----
echo ---------------------------------
