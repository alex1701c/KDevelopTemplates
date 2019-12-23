#!/bin/bash


mkdir -p ~/.local/share/kdevappwizard/template_descriptions/
mkdir -p ~/.local/share/kdevappwizard/templates/

# This automatically updates/installs the template in your local templates folder
if [[ $(basename "$PWD") == "krunner_dbus_cpp" ]];then
    mkdir -p build
    rm -rf build/*
    cd build
    cmake ..
    make
    /bin/cp ../krunner_dbus_cpp/krunner_dbus_cpp.kdevtemplate ~/.local/share/kdevappwizard/template_descriptions/
    /bin/cp krunner_dbus_cpp.tar.bz2 ~/.local/share/kdevappwizard/templates/
else
    echo "Please go to the project root"
fi
