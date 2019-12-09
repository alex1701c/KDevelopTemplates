#!/bin/bash

# This automatically updates/installs the template in your local templates folder
if [[ $(basename "$PWD") == "kdevelop_app_template_template" ]];then
    mkdir -p build
    rm -rf build/*
    cd build
    cmake ..
    make
    cp ../kdevelop_app_template/kdevelop_app_template.kdevtemplate ~/.local/share/kdevappwizard/template_descriptions/
    cp kdevelop_app_template.tar.bz2 ~/.local/share/kdevappwizard/templates/
else
    echo "Please go to the project root"
fi