#include <QCommandLineParser>
#include <QDebug>

int main(int argc, char *argv[]) {
    QCoreApplication app(argc, argv);
    QCoreApplication::setApplicationName("%{APPNAME}");
    QCoreApplication::setApplicationVersion("1.0");

    QCommandLineParser parser;
    parser.setApplicationDescription("Description for %{APPNAME}...");
    parser.addHelpOption();
    parser.addVersionOption();
    parser.addPositionalArgument("arg", "Positional argument");

    // Gets triggered with -t and expects value
    QCommandLineOption testOption("t", "Description", "<value_name>");
    parser.addOption(testOption);
    // Gets triggered with -d and --debug and expects no value
    QCommandLineOption debugOption(QStringList() << "d" << "debug", "Debug results");
    parser.addOption(debugOption);

    parser.process(app);

    const QStringList args = parser.positionalArguments();
    const QString testResult = parser.value(testOption);
    if (parser.isSet(debugOption)) {
        // For docs see https://doc.qt.io/qt-5/qcommandlineparser.html
        qDebug() << "Positional parameters:" << args;
        qDebug() << "Test:" << testResult;
    }


}