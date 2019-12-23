//  Licensed under the GNU LESSER GENERAL PUBLIC LICENSE Version 2.1. See License in the project root for license information.
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

