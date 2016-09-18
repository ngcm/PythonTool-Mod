---
layout: page
title: User guide 
permalink: userguide/
---

Just craft the Computer Block and place it in your world. The recipe takes 8 Cobblestone blocks and 1 Glass block arranged as shown in the picture. It can also be found in the Miscellaneous creative tab if in creative mode.

![ComputerBlock recipe](/PythonTool-Mod/images/recipe.png)
![ComputerBlock](/PythonTool-Mod/images/computerblock.png)

The Computer Block looks at a given folder in your system (select it in PythonTool's mod config menu) where you will place your scripts: [create your own](/PythonTool-Mod/startcoding/) or get dozens freely available online! Right-click on the Computer Block, you will see all those scripts in your folder as Python Script Items in the game, you can move them to your inventory or hot bar.

![ComputerBlock inventory](/PythonTool-Mod/images/computer_inventory.png)
![House ScriptItem](/PythonTool-Mod/images/scriptItem_house.png)

Equip and right-click a Script Item to get it running!

![Castle](/PythonTool-Mod/images/castle.png)

An arbitrary number of Python Scripts can be running at the same time. Right click on a Python Script will stop *all* running scripts *and* execute the new one. If you want to launch a new script and keep any previous ones running, use shift+right click (sneak click!). If you wish to just stop all running scripts without running a new one, you can type `/py` in the chat console.

There are three Python Script Item variants which can help you organise your script collection. They all work the same but have different textures, as displayed in the following picture:

![Script Variants](/PythonTool-Mod/images/scriptVariants.png)

from left to right: standard, Housing, Teleport and Lighting. When you create or download a script that teleports the payer, you can decide to give it a Teleport Script texture. To achieve this, just open the *.py* file and add `# metadata 2` in the very first line of the file. Leave the script as it is below that.

`# metadata 1` will give you a Housing Script, and `# metadata 3` a Lighting Script. With number `0` or nothing at all, the standard Script Item will be used.

