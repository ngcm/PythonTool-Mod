#! /bin/bash

echo ---------------------------------
echo ----- STARTING INSTALLATION -----
echo ---------------------------------

# Download Forge 1.8 from the internet
curl -o forge.zip http://files.minecraftforge.net/maven/net/minecraftforge/forge/1.9-12.16.1.1887/forge-1.9-12.16.1.1887-mdk.zip

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
