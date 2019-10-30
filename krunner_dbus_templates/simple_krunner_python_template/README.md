### Simple Krunner dbus template

This plugin provides a simple template for a Krunner plugin using dbus.
 
To run this plugin you have to execute the `make install-config` command.
This installs the .desktop file so that your runner gets recognized.  
Secondly you have to run your script. Because Krunner queries the dbus
interface and does not load a plugin you can use for example a debugger.
 
More information can be found here:  
https://cgit.kde.org/krunner.git/plain/src/data/org.kde.krunner1.xml  
https://techbase.kde.org/Development/Tutorials/D-Bus/Introduction

On Debian/Ubuntu you need:   
`sudo apt install python3 python3-hglib`