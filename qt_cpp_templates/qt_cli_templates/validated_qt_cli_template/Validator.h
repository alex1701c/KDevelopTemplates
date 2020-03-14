#ifndef %{APPNAMEUC}_VALIDATOR_H
#define %{APPNAMEUC}_VALIDATOR_H

#include <QCommandLineParser>

struct CommandLineValues {
    QString data;
};

enum CommandLineParseResult {
    CommandLineOk,
    CommandLineError,
    CommandLineVersionRequested,
    CommandLineHelpRequested
};

CommandLineParseResult validateCommandLine(QCommandLineParser &parser, CommandLineValues *data, QString *errorMessage);

#endif //%{APPNAMEUC}_VALIDATOR_H
