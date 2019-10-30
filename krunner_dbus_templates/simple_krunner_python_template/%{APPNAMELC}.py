#!/bin/env python3

import dbus.service
from dbus.mainloop.glib import DBusGMainLoop
from gi.repository import GLib

DBusGMainLoop(set_as_default=True)

objpath = "/%{APPNAMELC}"

iface = "org.kde.krunner1"


class Runner(dbus.service.Object):
    def __init__(self):
        dbus.service.Object.__init__(self, dbus.service.BusName("net.%{APPNAMELC}2", dbus.SessionBus()), objpath)

    @dbus.service.method(iface, in_signature='s', out_signature='a(sssida{sv})')
    def Match(self, query: str):
        if query == "hello":
            # action text, display name, icon, type (Plasma::QueryType), relevance (0-1), properties (subtext, category and urls)
            return [("Hello", "Hello from %{APPNAME}!", "document-edit", 100, 1.0, {'subtext': 'Demo Subtext'})]
        return []

    @dbus.service.method(iface, in_signature='ss')
    def Run(self, match_id: str, _action_id: str):
        print(match_id)


runner = Runner()
loop = GLib.MainLoop()
loop.run()
