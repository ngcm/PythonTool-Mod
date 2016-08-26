![Circle CI](https://circleci.com/gh/ngcm/PyCraft-Mod.svg?style=shield&circle-token=:circle-token)][![codebeat badge](https://codebeat.co/badges/334becab-8080-48b0-93a8-d050d850f73a)](https://codebeat.co/projects/github-com-ngcm-pycraft-mod)

# PyCraft-Mod for Minecraft
#### Interactively alter your Minecraft world in real time, using Python.

![PyCraft-logo-large](http://www.southampton.ac.uk/~apd1g15/pycraft/media/pycraft_logo_large.jpg)

Build arbitrary things, turn blocks into bombs or create interactive games, just with one click!
This Forge mod builds on top of [Raspberry Jam Mod](https://github.com/arpruss/raspberryjammod) and provides a visual interface to use in-game Python scripts.

---

## Downloads

* [Pycraft for Minecraft 1.8](http://www.southampton.ac.uk/~apd1g15/pycraft/18/pycraft-18-0.8.jar)

## User guide

Just craft the Computer Block and place it in your world. It can also be found in the Miscellaneous creative tab.

![ComputerBlock recipe](http://www.southampton.ac.uk/~apd1g15/pycraft/media/recipe_cropped.png)
![ComputerBlock](http://www.southampton.ac.uk/~apd1g15/pycraft/media/computerblock_cropped.png)

Create (or download, dozens freely available!) your own Python scripts, using the [mcpipy library](), place your scripts in a folder called *pycraft* in your desktop, and open the Computer Block in the game.

![ComputerBlock inventory](http://www.southampton.ac.uk/~apd1g15/pycraft/media/computer_inventory_cropped.png)
![House ScriptItem](http://www.southampton.ac.uk/~apd1g15/pycraft/media/scriptItem_house_cropped.png)

You will see all those scripts in your pycraft folder as Script Items in the game, equip your favourite and right-click it to get it running!

![Castle](http://www.southampton.ac.uk/~apd1g15/pycraft/media/castle_cropped.png)

Shift+right click will run the equiped Script Item without stopping any previous running scripts. Right click will stop *all* running scripts *and* execute the new one.

---

## Installation guide

### Download and install Minecraft

1. Download Minecraft: visit https://minecraft.net/en/ and log-in with your account, download the game selecting Windows/Mac OS/Linux as corresponding to your system.
2. Install Minecraft: using the installer you've just downloaded, just follow the instructions! It would be better to install it in the default folder. If for some reason you don't want it there, change it and remember your custom installation path.
3. Open Minecraft: after some downloads, log-in using your username and password. You will get to the Minecraft launcher.

### Get Minecraft ready for Forge (mod loader)

1. Click on *Edit Profile*
2. Click on *Use version:* and select the game version of your choice (see above that Pycraft is available for a number of recent Minecraft versions, choose your favourite!)
3. Click on *Save Profile*
4. Click *Play*, to download and open the game. Once the game is loaded at least once, we can go ahead and download Forge.

### Download and install Forge

1. Download Forge ****** http://files.minecraftforge.net/maven/net/minecraftforge/forge/1.8-11.14.4.1563/forge-1.8-11.14.4.1563-installer.jar
2. Install Forge: open the file you've just downloaded and select *Install client* and the Minecraft installation path: if you used the default one, just click *OK*, if you changed it, point the installer to your custom intallation path.
3. Open Minecraft, click on *Profile*, now there should be a new user apart from your user name, select *forge*. On the right hand side it should say *Ready to update & play Minecraft 1.8-forge...*. If it doesn't, repeat step 5, and select the option at the botton of the *Use version:* list. When it's ready, click *Play*.
4. You should see a slightly different Minecraft main menu, there should be some info on the bottom-left, and a new *Mods* button. Great, you're nearly there!

### Install RaspberryJam Mod

1. Visit [RaspberryJam's website] (https://github.com/arpruss/raspberryjammod/releases/latest)

### Install PyCraft!

12. Download PyCraft from the [download section](#downloads) of this website
13. Move this file to Forge's mods folder, which is located in your Minecraft installation folder. Default installation paths are:
    * Windows: Users\**yourUser**\AppData\Roaming\.minecraft\mods
    * Mac OS: /Library/Application Support/minecraft/mods
    * Linux: ******
If you changed it when you installed Minecraft, use your custom path.
