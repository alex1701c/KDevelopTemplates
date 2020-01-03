const dbus = require('dbus-native');

const { createKRunnerInterface } = require('./dbus-connection');

const sessionBus = dbus.sessionBus();
if (!sessionBus) throw new Error('Failed to connect to the session bus');


createKRunnerInterface({
    path: '/%{APPNAMELC}',
    async runFunction(matchID, actionID) {
        console.log(`Match ID: ${matchID} ActionID: ${actionID}`);
    },
    async matchFunction(query) {
        console.log(`Javascript Runner: ${query}`);
        return [
            ['JS-Runer', 'Hello There!', 'planetkde', 50, 1, {}]
        ];
    },
});