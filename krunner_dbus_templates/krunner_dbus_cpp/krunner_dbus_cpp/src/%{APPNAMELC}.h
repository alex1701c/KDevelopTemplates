#pragma once
#include <QObject>
#include "dbus_utils.h"

class %{APPNAME} : public QObject {
Q_OBJECT
public:
    explicit %{APPNAME}();

public Q_SLOTS:

    RemoteActions Actions();

    RemoteMatches Match(const QString &searchTerm);

    void Run(const QString &id, const QString &actionId);
};

