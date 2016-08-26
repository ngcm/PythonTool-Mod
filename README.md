![Circle CI](https://circleci.com/gh/ngcm/PyCraft-Mod.svg?style=shield&circle-token=:circle-token) [![codebeat badge](https://codebeat.co/badges/334becab-8080-48b0-93a8-d050d850f73a)](https://codebeat.co/projects/github-com-ngcm-pycraft-mod)

# PyCraft-Mod for Minecraft
#### Interactively alter your Minecraft world in real time, using Python.

![PyCraft-logo-large](http://www.southampton.ac.uk/~apd1g15/pycraft/media/pycraft_logo_large.jpg)

Build arbitrary things, turn blocks into bombs or create interactive games, just with one click!
This Forge mod builds on top of [Raspberry Jam Mod](https://github.com/arpruss/raspberryjammod) and provides a visual interface to use in-game Python scripts.

---

## Downloads

| Minecraft version |       |         |
| ---:              | :---: |   ---:  |
| 1.8    | [Forge](http://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.8.html)    | [PyCraft 0.8](http://www.southampton.ac.uk/~apd1g15/pycraft/18/pycraft-0.8.jar)   |
| 1.8.8  | [Forge](http://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.8.8.html)  | [PyCraft 0.8](http://www.southampton.ac.uk/~apd1g15/pycraft/188/pycraft-0.8.jar) |
| 1.8.9  | [Forge](http://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.8.9.html)  | [PyCraft 0.8](http://www.southampton.ac.uk/~apd1g15/pycraft/189/pycraft-0.8.jar) |
| 1.9    | [Forge](http://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.9.html)    | [PyCraft 0.8](http://www.southampton.ac.uk/~apd1g15/pycraft/19/pycraft-0.8.jar) |
| 1.9.4  | [Forge](http://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.9.4.html)  | [PyCraft 0.8](http://www.southampton.ac.uk/~apd1g15/pycraft/194/pycraft-0.8.jar) |
| 1.10   | [Forge](http://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.10.html)   | [PyCraft 0.8](http://www.southampton.ac.uk/~apd1g15/pycraft/110/pycraft-0.8.jar) |
| 1.10.2 | [Forge](http://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.10.2.html) | [PyCraft 0.8](http://www.southampton.ac.uk/~apd1g15/pycraft/1102/pycraft-0.8.jar) |

## User guide

Just craft the Computer Block and place it in your world. It can also be found in the Miscellaneous creative tab.

![ComputerBlock recipe](http://www.southampton.ac.uk/~apd1g15/pycraft/media/recipe_cropped.png)
![ComputerBlock](http://www.southampton.ac.uk/~apd1g15/pycraft/media/computerblock_cropped.png)

Create (or download, dozens freely available!) your own Python scripts, using the [mcpipy library](http://www.stuffaboutcode.com/p/minecraft.html), place your scripts in a folder called *pycraft* in your desktop, and open the Computer Block in the game.

![ComputerBlock inventory](http://www.southampton.ac.uk/~apd1g15/pycraft/media/computer_inventory_cropped.png)
![House ScriptItem](http://www.southampton.ac.uk/~apd1g15/pycraft/media/scriptItem_house_cropped.png)

You will see all those scripts in your pycraft folder as Script Items in the game, equip your favourite and right-click it to get it running!

![Castle](http://www.southampton.ac.uk/~apd1g15/pycraft/media/castle_cropped.png)

An arbitrary number of Python Scripts can be running at the same time. Right click on a Python Script will stop *all* running scripts *and* execute the new one. If you want to launch a new script and keep any previous ones running, use shift+right click (sneak click!). If you wish to just stop all running scripts without running a new one, you can type `/py` in the chat console.

---

## Quick installation guide

Get Minecraft running with Forge installed on it. Donwload both [RaspberryJam](https://github.com/arpruss/raspberryjammod/releases/latest) and [PyCraft mods](#downloads) for your favourite Minecraft version. Install them by placing the `.jar` mod files in your `minecraft/mods/_version_/` folder. RaspberryJam's `mcpipy` folder needs to be present in `minecraft/mcpipy` as well, it can be downloaded from the same [link](https://github.com/arpruss/raspberryjammod/releases/latest) under the name `python-sripts.zip`. Install [Python](https://www.python.org/downloads/) as well, both Python 2 or Python 3 will work.

Create a folder called `pycraft` in your desktop and place your scripts there (dozens of examples can be found inside the `minecraft/mcpipy` folder you've just created). All the Python scripts present in this folder will be in the Computer Block from PyCraft. Note that this folder can be changed to any in your system in PyCraft's configuration menu, in Minecraft main menu.

Have a look at the [user guide](#user-guide) and happy progamming!

---

## Installation guide

### Download and install Minecraft

1. Download Minecraft: visit https://minecraft.net/en/ and log-in with your account, download the game selecting Windows/Mac OS/Linux as corresponding to your system.
2. Install Minecraft: using the installer you've just downloaded, just follow the instructions! It would be better to install it in the default folder. If for some reason you don't want it there, change it and remember your custom installation path.
3. Open Minecraft: after some downloads, log-in using your username and password. You will get to the Minecraft launcher.

### Get Minecraft ready for Forge (mod loader)

1. Click on *Edit Profile*
2. Click on *Use version:* and select the game version of your choice (see above that Pycraft is available for all modern Minecraft versions, choose your favourite! If in doubt, why not try the most recent one, 1.10.2?
4. Click *Play*, to download and open the game. Once the game is loaded at least once, we can go ahead and download Forge.

### Download and install Forge

1. Choose the appropriate version of Forge in the [Downloads](#downloads) section just above, click on the link and you'll be taken to the official Forge website. You want to download the *recommended* installer (Mac/Linux) or installer-win (Windows).
2. Install Forge: open the file you've just downloaded and select *Install client* and the Minecraft installation path: if you used the default one, just click *OK*, if you changed it, point the installer to your custom intallation path.
3. Open Minecraft, click on *Profile*, now there should be a new user apart from your user name, select *forge*. On the right hand side it should say *Ready to update & play Minecraft 1.8-forge...*. If it doesn't, repeat step 5, and select the option at the botton of the *Use version:* list. When it's ready, click *Play*.
4. You should see a slightly different Minecraft main menu, there should be some info on the bottom-left, and a new *Mods* button. Great, you're nearly there!

### Install RaspberryJam Mod

1. Visit [RaspberryJam's website] (https://github.com/arpruss/raspberryjammod/releases/latest)
2. If you are using Windows, you can download and execute `RaspberryJamMod-Installer.exe`, it will install the mod, the needed Python library and Python itself for you!
3. If you are using Mac/Linux or Windows but you don't want to use the installer, download `mods.zip` and `python-sripts.zip`, uncompress both and place the `mods` and `mcpipy` folders in your Minecraft installation folder. Default installation paths are:
    * Windows: `Users\**yourUserName**\AppData\Roaming\.minecraft`
    * Mac OS: `~/Library/Application Support/minecraft`
    * Linux: `/Home/**yourUserName**/.minecraft/`

### Install PyCraft!

12. Download PyCraft from the [download section](#downloads) above, remember to choose the right version!
13. Move this file to Forge's mods folder, which is located in your Minecraft installation folder, select the appropriate version folder inside `mods` folder. Default installation paths are:
    * Windows: `Users\**yourUserName**\AppData\Roaming\.minecraft\mods`
    * Mac OS: `~/Library/Application Support/minecraft/mods`
    * Linux: `/Home/**yourUserName**/.minecraft/mods`
If you changed it when you installed Minecraft, use your custom path.

---

## Troubleshooting

#### Wait, what is a mod??
A great explanation can be found [here](http://minemum.com/what-are-mods).

#### Cannot find my game files!
Have a look at this [link](http://minemum.com/game-files). It will point you to the default paths and explain how to access those paths. If you modified the game path when you installed it, you will have to remember that path, look for it, or uninstall and install Minecraft again.

#### Not sure about Minecraft versions and profiles!
See if this [link](http://minemum.com/version-profiles) sheds some light! If unsure, just choose the last release, which is 1.10.2 at the time of writing this.

#### A bit more detail on installing Forge mods?
Check this [guide](http://minemum.com/installing-mods)!

#### Forge is throwing errors at me!
There's a great guide [here](http://minemum.com/troubleshooting-forge) which explains how to fix a number of common errors.
