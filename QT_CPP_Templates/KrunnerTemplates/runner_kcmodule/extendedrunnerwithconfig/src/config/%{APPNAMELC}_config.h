#ifndef %{APPNAME}CONFIG_H
#define %{APPNAME}CONFIG_H

#include "ui_%{APPNAMELC}_config.h"
#include <KCModule>
#include <KConfigCore/KConfigGroup>

class %{APPNAME}ConfigForm : public QWidget, public Ui::%{APPNAME}ConfigUi {
Q_OBJECT

public:
    explicit %{APPNAME}ConfigForm(QWidget *parent);
};

class %{APPNAME}Config : public KCModule {
Q_OBJECT

public:
    explicit %{APPNAME}Config(QWidget *parent = nullptr, const QVariantList &args = QVariantList());

public Q_SLOTS:
    void save() override;
    void load() override;
    void defaults() override;

private:
    %{APPNAME}ConfigForm *m_ui;

};

#endif
