---
layout: page
title: Installation
permalink: installation/
---

## Quick installation guide

Get Minecraft running with Forge installed on it. Donwload both [RaspberryJam](https://github.com/arpruss/raspberryjammod/releases/latest) and [PyCraft mods](/testtt/downloads/) for your favourite Minecraft version. Install them by placing the `.jar` mod files in your `minecraft/mods/**version**/` folder. RaspberryJam's `mcpipy` folder needs to be present in `minecraft/mcpipy` as well, it can be downloaded from the same [link](https://github.com/arpruss/raspberryjammod/releases/latest) under the name `python-sripts.zip`. Install [Python](https://www.python.org/downloads/) as well, both Python 2 or Python 3 will work.

PythonTool Mod uses a personal folder of your choice to store your scripts. This folder can be changed to any in your system in PyCraft's configuration menu, in Minecraft main menu. By default it points to the `minecraft/mcpipy` folder you just downloaded, so that you can use the many examples that come there.

To use your selection of scripts, create a folder called `pycraft` in your desktop and move your desired scripts there. Change the personal folder in PythonTool's settings menu. All the Python scripts present in this folder will be in the Computer Block from PyCraft.

Have a look at the [user guide](/testtt/userguide/) to learn everything about PythonTool Mod, and check the [start coding guide](/testtt/startcoding/) to learn about how to make your own scripts. Happy programming!

---

## Full installation guide

### Download and install Minecraft

1. Buy and download Minecraft: visit [https://minecraft.net/en/]([https://minecraft.net/en/), create or log-in with your account and download the game selecting Windows/Mac OS/Linux as corresponding to your system. If you haven't purchased Minecraft, you will need to do so in order to download and play it.
2. Install Minecraft: using the installer you've just downloaded, just follow the instructions! It would be better to install it in the default folder. If for some reason you don't want it there, change it and remember your custom installation path.
3. Open Minecraft: after some downloads, log-in using your username and password. You will get to the Minecraft launcher.

### Get Minecraft ready for Forge (mod loader)

1. Click on *Edit Profile*
2. Click on *Use version:* and select the game version of your choice (see above that PythonTool is available for all modern Minecraft versions, choose your favourite). If in doubt, why not try the most recent one, 1.10.2?
4. Click *Play*, to download and open the game. Once the game is loaded at least once, we can go ahead and download Forge. Close Minecraft.

### Download and install Forge

1. Choose the appropriate version of Forge in the [Downloads](/testtt/downloads/) section just above, click on the link and you'll be taken to the official Forge website. You want to download the *recommended* installer (Mac/Linux) or installer-win (Windows).
2. Install Forge: open the file you've just downloaded and select *Install client* and the Minecraft installation path: if you used the default one, just click *OK*, if you changed it, point the installer to your custom installation path.
3. Open Minecraft, click on *Profile*, now there should be a new user apart from your user name, select *forge*. On the right hand side it should say *Ready to update & play Minecraft 1.8-forge...*. If it doesn't, repeat step 5, and select the option at the bottom of the *Use version:* list. When it's ready, click *Play*.
4. You should see a slightly different Minecraft main menu, there should be some info on the bottom-left, and a new *Mods* button. Great, you're nearly there! Close Minecraft.

### Install RaspberryJam Mod

1. Visit [RaspberryJam's website] (https://github.com/arpruss/raspberryjammod/releases/latest)
2. If you are using Windows, you can download and execute `RaspberryJamMod-Installer.exe`, it will install the mod, the needed Python library and Python itself for you!
3. If you are using Mac/Linux or Windows but you don't want to use the installer, download `mods.zip` and `python-sripts.zip`, uncompress both and place the `mods` and `mcpipy` folders in your Minecraft installation folder. Default installation paths are:
    * Windows: `Users\**yourUserName**\AppData\Roaming\.minecraft`
    * Mac OS: `~/Library/Application Support/minecraft`
    * Linux: `/Home/**yourUserName**/.minecraft/`

### Install PythonTool!

1. Download PythonTool from the [download section](/testtt/downloads/) above, remember to choose the right version!
2. Move this file to Forge's mods folder, which is located in your Minecraft installation folder, select the appropriate version folder inside `mods` folder. Default installation paths are:
    * Windows: `Users\**yourUserName**\AppData\Roaming\.minecraft\mods`
    * Mac OS: `~/Library/Application Support/minecraft/mods`
    * Linux: `/Home/**yourUserName**/.minecraft/mods`
If you changed it when you installed Minecraft, use your custom path.

### Configure PythonTool!

In this last tiny step, we will quickly configure PythonTool. The way it works is, you specify a folder of your choice, and place your scripts there, then when you open the Computer Block in your Minecraft world, all those scripts will appear there as Python Script items, which you can carry and use whenever you want!

So the only thing we need to do is to make sure PythonTool knows which folder you wish to use. By default it points to a folder in your installation path full of example scripts (so many that they don't fit all in the Computer Block). If you want to have a look at those, great! But at some point you'll want to create your own, or to make a selection. Just follow this steps:

1. Create our custom folder called maybe pythontool, in Desktop (for example)
2. Open Minecraft, and in the main screen go to Mods, select PythonTool Mod, and click on Config. This is the configuration menu, click on `Script Path Configuration`. Here there are two configuration fields:
   * `mcpipy folder`: this points to RaspberryJam Mod's folder in your Minecraft installation path. If you have installed everything in the default directories, it is already pointing to the right place.
   * `Script folder`: this is your custom folder, type the address of your custom folder. For our pythontool folder in Desktop, if you are using Windows, it will look like this: `Users\**yourUserName**\Desktop\pythontool`.
3. Everything should be ready now, click on `Done` a few times to go back to the main screen, and start your world. Enjoy!

### Configure PyCraft!

In this last tiny step, we will quickly configure PyCraft. The way it works is, you specify a folder of your choice, and place your scripts there, then when you open the Computer Block in your Minecraft world, all those scripts will appear there as Python Script items, which you can carry and use whenever you want!

So the only thing we need to do is to make sure PyCraft knows which folder you wish to use. By default it points to a folder in your installation path full of example scripts (so many that they don't fit all in the Computer Block). If you want to have a look at those, great! But at some point you'll want to create your own, or to make a selection. Just follow this steps:

Create our custom folder called maybe pycraft, in Desktop (for example)
Open Minecraft, and in the main screen go to Mods, select PyCraft Mod, and click on Config. This is the configuration menu, click on Script Path Configuration. Here there are two configuration fields:
mcpipy folder: this points to RaspberryJam Mod's folder in your Minecraft installation path. If you have installed everything in the default directories, it is already pointing to the right place.
Script folder: this is your custom folder, type the address of your custom folder. For our pycraft folder in Desktop, if you are using Windows, it will look like this: Users\**yourUserName**\Desktop\pycraft.
Everything should be ready now, clik on Done a few times to go back to the main screen, and start your world. Enjoy!
