---
layout: page
title: Hello world!
permalink: startcoding/helloworld/
---


# Hello world example

To get started with Python and Minecraft, let's create a code which will print **Hello world!** to the chat window.

To connect and interact with Minecraft we will use the **mcpi** library, so make use the `mcpi` folder you downloaded from RaspberryJam Mod's website is present in the same directory as this notebook. As an example, let's say you have the following folders:
* Desktop
    * My Scripts
        * mcpi
        * Hello_world.ipynb

Let's start coding!

### 1. Get Minecraft ready

It is a good idea to tell Minecraft not to go into Settings Menu when you switch to another window, for example this browser, using maybe `alt+tab`. To do so, go to your Minecraft installation folder and edit the `options.txt` file.
Find the `pauseOnLostFocus` value and replace `true` by `false`. Now your Minecraft game won't go into Settings Menu when you are writing your code here, and you can see everything in real time!

Now open your Minecraft game with RaspberryJam and PythonTool mods loaded, and load your favourite world, both creative or survival modes work great!

###  2. Load the required libraries

We have to tell Python which libraries we're going to use, so that it can **import** them.


```python
import mcpi.minecraft as minecraft
import mcpi.block as block
```

If executing the previous cell gives you errors, it means that the `mcpi` folder is not in the same directory as this notebook, so Python cannot find it! Make sure you've placed it there.

### 3. Establish a connection to your loaded Minecraft world

Now that your world is up and running, and you have the `mcpi` library loaded in Python, we can make a connection to your game!


```python
mc = minecraft.Minecraft.create()
```

When you execute the previous cell, it should connect without any complains or output. If an error is thrown, check that your Minecraft game has RaspberryJam and PythonTool mods loaded, and that you have opened a world.

### 4. Post "Hello world!" to the chat window!


```python
mc.postToChat("Hello world!")
```


