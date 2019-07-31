#include "Validator.h"
#include <QDebug>

CommandLineParseResult validateCommandLine(QCommandLineParser &parser, CommandLineValues *data, QString *errorMessage) {
    parser.setSingleDashWordOptionMode(QCommandLineParser::ParseAsLongOptions);
    parser.setApplicationDescription("Description...");

    const QCommandLineOption helpOption = parser.addHelpOption();
    const QCommandLineOption versionOption = parser.addVersionOption();

    parser.addPositionalArgument("data", "Data property of struct", "<data>");

    const QCommandLineOption debugOption(QStringList() << "d" << "debug", "Debug results");
    parser.addOption(debugOption);

    if (!parser.parse(QCoreApplication::arguments())) {
        *errorMessage = parser.errorText();
        return CommandLineError;
    }

    if (parser.isSet(versionOption))
        return CommandLineVersionRequested;

    if (parser.isSet(helpOption))
        return CommandLineHelpRequested;

    const QStringList positionalArguments = parser.positionalArguments();

    if (positionalArguments.isEmpty() || positionalArguments.first().isEmpty()) {
        *errorMessage = "Argument <data> missing.";
        return CommandLineError;
    }
    if (positionalArguments.size() > 1) {
        *errorMessage = "Several <data> arguments specified.";
        return CommandLineError;
    }

    data->data = positionalArguments.first();

    if (parser.isSet(debugOption)) {
        qDebug() << "Positional arguments: " << positionalArguments;
    }

    return CommandLineOk;
}
