#ifndef %{APPNAMEUC}_H
#define %{APPNAMEUC}_H

#include <KRunner/AbstractRunner>

class %{APPNAME} : public Plasma::AbstractRunner
{
    Q_OBJECT

public:
    %{APPNAME}(QObject *parent, const QVariantList &args);
    ~%{APPNAME}() override;

protected Q_SLOTS:
    void init() override;
    void prepareForMatchSession();
    void matchSessionFinished();

public: // Plasma::AbstractRunner API
    void reloadConfiguration() override;
    void match(Plasma::RunnerContext &context) override;
    void run(const Plasma::RunnerContext &context, const Plasma::QueryMatch &match) override;
};

#endif
