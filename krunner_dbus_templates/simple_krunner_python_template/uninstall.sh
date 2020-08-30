#!/bin/bash

# Exit if something fails
set -e

rm ~/.local/share/kservices5/plasma-runner-%{APPNAMELC}.desktop
rm ~/.local/share/dbus-1/services/org.kde.%{APPNAMELC}.service
kquitapp5 krunner
