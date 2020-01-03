# %{APPNAME} 

This plugin uses DBus to communicate with KRunner.


## Installation

```bash
cd /path/to/%{APPNAME}
npm install
cp plasma-runner-%{APPNAMELC}.desktop ~/.local/share/kservices5/
kquitapp5 krunner 2> /dev/null; kstart5 --windowclass krunner krunner > /dev/null 2>&1 &
npm start
```

In order to use the bundle-standalone script you have to install the pkg npm package (`npm i -g pkg`), for the bundle-dependencies 
script you have to install makeself from github (https://github.com/megastep/makeself) or your package manager.
