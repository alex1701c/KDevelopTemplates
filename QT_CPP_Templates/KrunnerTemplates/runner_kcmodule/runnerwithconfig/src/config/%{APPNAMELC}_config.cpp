#include "%{APPNAMELC}_config.h"
#include <KSharedConfig>
#include <KPluginFactory>
#include <krunner/abstractrunner.h>

K_PLUGIN_FACTORY(%{APPNAME}ConfigFactory, registerPlugin<%{APPNAME}Config>("kcm_krunner_%{APPNAMELC}");)

%{APPNAME}ConfigForm::%{APPNAME}ConfigForm(QWidget *parent) : QWidget(parent) {
    setupUi(this);
}

%{APPNAME}Config::%{APPNAME}Config(QWidget *parent, const QVariantList &args) : KCModule(parent, args) {
    m_ui = new %{APPNAME}ConfigForm(this);
    auto *layout = new QGridLayout(this);
    layout->addWidget(m_ui, 0, 0);

    // TODO connect signals

    load();
}

void %{APPNAME}Config::load() {

    KCModule::load();
    
    // TODO load settings into GUI
    emit changed(false);
}


void %{APPNAME}Config::save() {

    KCModule::save();

    // TODO save settings
    emit changed(false);
}

void %{APPNAME}Config::defaults() {

    KCModule::defaults();

    // TODO set default values in GUI 
    emit changed(true);
}


#include "%{APPNAMELC}_config.moc"
