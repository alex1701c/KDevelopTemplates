# Dolphin Service Menu Plugin

This project is a plugin for dolphin which provides service menus.

To build this plugin run:
```
mkdir -p build
cd build
cmake ..
# With Makefiles
make -j$(nproc)
sudo make install
# or with ninja
ninja -j$(nproc)
sudo ninja install
```

To create a more optimized release build run instead of
`cmake ..` `cmake -DCMAKE_BUILD_TYPE=Release ..`

The plugin can be disabled in Configure Dolphin -> Services -> uncheck %{APPNAME} 
or uninstalled by running `sudo make uninstall` or `sudo ninja uninstall` from the build directory

See https://api.kde.org/frameworks-api/frameworks-apidocs/frameworks/kio/html/classKAbstractFileItemActionPlugin.html for the official docs.