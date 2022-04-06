### Simple Krunner dbus template

This plugin provides a simple template for a Krunner plugin using dbus.
 
To run this plugin you have to execute the `make install-dev` command.
This installs the .desktop file so that your runner gets recognized.  
Secondly you have to run your project.
Because KRunner queries the dbus interface and does not load a
plugin you can use for example a debugger.

#### How It Is Organized
This project is organized using modules, which makes it easier to manage
multiple files.
When your run this project `python3 -m %{APPNAMELC}` the main function
from %{APPNAMELC}/main.py gets executed and the Runner class, which contains the
important logic for the runner is loaded.

In this class there are the Match and Run Method. The Match method is used
to generate the matches and it gets the query the user typed in as a parameter.  
The method returns a list of QueryMatches, these get converted by the 
`@convert_matches` decorator to tupels.
The Run method gets the data of the selected match. The action id is by default empty,
unless you define custom actions.


More information can be found here:  
https://invent.kde.org/frameworks/krunner/-/blob/master/src/data/org.kde.krunner1.xml  
https://develop.kde.org/docs/use/d-bus/introduction_to_dbus/

On Debian/Ubuntu you need:   
`sudo apt install python3 python3-hglib`