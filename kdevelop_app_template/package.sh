#!/bin/bash


mkdir -p ~/.local/share/kdevappwizard/template_descriptions/
mkdir -p ~/.local/share/kdevappwizard/templates/

# This automatically updates/installs the template in your local templates folder
if [[ $(basename "$PWD") == "%{PROJECTDIRNAME}" ]];then
    mkdir -p build
    rm -rf build/*
    cd build
    cmake ..
    make
    /bin/cp ../%{APPNAMELC}/%{APPNAMELC}.kdevtemplate ~/.local/share/kdevappwizard/template_descriptions/
    /bin/cp %{APPNAMELC}.tar.bz2 ~/.local/share/kdevappwizard/templates/
else
    echo "Please go to the project root"
fi