from dbus.mainloop.glib import DBusGMainLoop
from gi.repository import GLib

from %{APPNAMELC}.Runner import Runner


def main():
    DBusGMainLoop(set_as_default=True)
    runner = Runner()
    loop = GLib.MainLoop()
    loop.run()
