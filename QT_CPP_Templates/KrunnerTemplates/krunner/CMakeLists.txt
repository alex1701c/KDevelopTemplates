cmake_minimum_required(VERSION 3.0)

include(FeatureSummary)

find_package(ECM ${KF5_MIN_VERSION} REQUIRED NO_MODULE)
set(CMAKE_MODULE_PATH ${ECM_MODULE_PATH} ${ECM_KDE_MODULE_DIR} ${CMAKE_MODULE_PATH})

include(KDEInstallDirs)
include(KDEPackageAppTemplates)

set(basic_runner_template_DIRS
    basic_runner
)
set(extended_runner_template_DIRS
    extended_runner
)

kde_package_app_templates(TEMPLATES ${basic_runner_template_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})
kde_package_app_templates(TEMPLATES ${extended_runner_template_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})