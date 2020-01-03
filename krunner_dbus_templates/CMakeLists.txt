cmake_minimum_required(VERSION 3.0)

include(FeatureSummary)

find_package(ECM ${KF5_MIN_VERSION} REQUIRED NO_MODULE)
set(CMAKE_MODULE_PATH ${ECM_MODULE_PATH} ${ECM_KDE_MODULE_DIR} ${CMAKE_MODULE_PATH})

include(KDEInstallDirs)
include(KDEPackageAppTemplates)

set(simple_krunner_python_template_DIRS
        simple_krunner_python_template
)
set(modular_krunner_python_template_DIRS
        modular_krunner_python_template
)
set(js_runner_template_DIRS
        krunner_dbus_javascript
)
kde_package_app_templates(TEMPLATES ${simple_krunner_python_template_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})
kde_package_app_templates(TEMPLATES ${modular_krunner_python_template_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})
kde_package_app_templates(TEMPLATES ${js_runner_template_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})
