import dbus
import dbus.service

from %{APPNAMELC}.utilities import convert_to_tupel
from %{APPNAMELC}.utilities.Match import Match
from %{APPNAMELC}.utilities.Action import Action

class Runner(dbus.service.Object):
    objpath = "/%{APPNAMELC}"
    iface = "org.kde.krunner1"

    def __init__(self):
        dbus.service.Object.__init__(self, dbus.service.BusName("net.%{APPNAMELC}2", dbus.SessionBus()), self.objpath)

    @dbus.service.method(iface, in_signature='s', out_signature='a(sssida{sv})')
    @convert_to_tupel
    def Match(self, query: str):
        matches: [Match] = []
        if query == "hello":
            match = Match()
            match.text = "Hello There!"
            match.data = "Data :-)"
            match.subtext = "Example"
            match.icon = "planetkde"
            matches.append(match)
        return matches

    @dbus.service.method(iface, out_signature='a(sss)')
    @convert_to_tupel
    def Actions(self):
        action = Action()
        action.id = "id"
        action.text = "Tooltip"
        action.icon = "planetkde"
        return [action]

    @dbus.service.method(iface, in_signature='ss')
    def Run(self, data: str, _action_id: str):
        print(data)

