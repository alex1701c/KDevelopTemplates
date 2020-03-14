#include <QCommandLineParser>
#include <Validator.h>

int main(int argc, char *argv[]) {
    QCoreApplication app(argc, argv);
    QCoreApplication::setApplicationName("%{APPNAME}");
    QCoreApplication::setApplicationVersion("1.0");

    QCommandLineParser parser;
    QString errorMessage;
    CommandLineValues data;

    switch (validateCommandLine(parser, &data, &errorMessage)) {
        case CommandLineOk:
            break;
        case CommandLineError:
            fprintf(stderr, "%s\n\n%s", qPrintable(errorMessage), qPrintable(parser.helpText()));
            exit(1);
        case CommandLineVersionRequested:
            parser.showVersion();
        case CommandLineHelpRequested:
            parser.showHelp(0);
    }
}