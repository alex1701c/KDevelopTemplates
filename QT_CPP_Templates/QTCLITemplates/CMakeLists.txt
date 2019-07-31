cmake_minimum_required(VERSION 3.0)

include(FeatureSummary)

find_package(ECM ${KF5_MIN_VERSION} REQUIRED NO_MODULE)
set(CMAKE_MODULE_PATH ${ECM_MODULE_PATH} ${ECM_KDE_MODULE_DIR} ${CMAKE_MODULE_PATH})

include(KDEInstallDirs)
include(KDEPackageAppTemplates)

set(basic_cli_template_DIRS
        basic_qt_cli_template
)
set(validated_cli_template_DIRS
        validated_qt_cli_template
)

kde_package_app_templates(TEMPLATES ${basic_cli_template_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})
kde_package_app_templates(TEMPLATES ${validated_cli_template_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})
