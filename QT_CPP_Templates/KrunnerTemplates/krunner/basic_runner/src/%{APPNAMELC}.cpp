#include "%{APPNAMELC}.h"

// KF
#include <KLocalizedString>

%{APPNAME}::%{APPNAME}(QObject *parent, const QVariantList &args)
    : Plasma::AbstractRunner(parent, args)
{
    setObjectName(QStringLiteral("%{APPNAME}"));
}

%{APPNAME}::~%{APPNAME}()
{
}


void %{APPNAME}::match(Plasma::RunnerContext &context)
{
    if(!context.isValid()) return;
    const QString term = context.query();
    if (term.length() < 3) {
        return;
    }
    QList<Plasma::QueryMatch> matches;

    Plasma::QueryMatch match(this);
    match.setIconName("kdeapp");
    match.setText("Hello World!");
    matches.append(match);
    
    context.addMatches(matches);
}

void %{APPNAME}::run(const Plasma::RunnerContext &context, const Plasma::QueryMatch &match)
{
    Q_UNUSED(context)
    Q_UNUSED(match)

    // TODO
}

K_EXPORT_PLASMA_RUNNER(%{APPNAMELC}, %{APPNAME})

// needed for the QObject subclass declared as part of K_EXPORT_PLASMA_RUNNER
#include "%{APPNAMELC}.moc"
