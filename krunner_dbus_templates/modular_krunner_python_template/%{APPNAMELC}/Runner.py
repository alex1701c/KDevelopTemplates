import dbus
import dbus.service

from %{APPNAMELC}.utilities.Match import QueryMatch, convert_matches


class Runner(dbus.service.Object):
    objpath = "/%{APPNAMELC}"
    iface = "org.kde.krunner1"

    def __init__(self):
        dbus.service.Object.__init__(self, dbus.service.BusName("net.%{APPNAMELC}2", dbus.SessionBus()), self.objpath)

    @dbus.service.method(iface, in_signature='s', out_signature='a(sssida{sv})')
    @convert_matches
    def Match(self, query: str):
        matches: [QueryMatch] = []
        if query == "hello":
            match = QueryMatch()
            match.text = "Hello There!"
            match.data = "Data :-)"
            match.subtext = "Example"
            match.icon = "planetkde"
            matches.append(match)
        return matches

    @dbus.service.method(iface, in_signature='ss')
    def Run(self, data: str, _action_id: str):
        print(data)

