#!/bin/bash

# This automatically updates/installs the template in your local templates folder
if [[ $(basename "$PWD") == "KDevelopTemplates" ]];then
    mkdir -p build
    cd build
    rm ./*.tar.bz2
    rm ./*/*.tar.bz2
    rm ./*/*/*.tar.bz2
    rm ./*/*/*/*.tar.bz2
    cmake -DKDE_INSTALL_KTEMPLATESDIR=~/.local/share/kdevappwizard/templates ..
    make install -j4
    cp ./*.desktop ~/.local/share/kdevappwizard/template_descriptions 2>>/dev/null
    cp ./*.kdevtemplate ~/.local/share/kdevappwizard/template_descriptions 2>>/dev/null
    cp ./*/*.desktop ~/.local/share/kdevappwizard/template_descriptions 2>>/dev/null
    cp ./*/*.kdevtemplate ~/.local/share/kdevappwizard/template_descriptions 2>>/dev/null
    cp ./*/*/*.desktop ~/.local/share/kdevappwizard/template_descriptions 2>>/dev/null
    cp ./*/*/*.kdevtemplate ~/.local/share/kdevappwizard/template_descriptions 2>>/dev/null
    cp ./*/*/*/*.desktop ~/.local/share/kdevappwizard/template_descriptions 2>>/dev/null
    cp ./*/*/*/*.kdevtemplate ~/.local/share/kdevappwizard/template_descriptions 2>>/dev/null
else
    echo "Please go to the project root"
fi
