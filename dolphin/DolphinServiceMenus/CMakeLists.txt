cmake_minimum_required(VERSION 3.0)

include(FeatureSummary)

find_package(ECM ${KF5_MIN_VERSION} REQUIRED NO_MODULE)
set(CMAKE_MODULE_PATH ${ECM_MODULE_PATH} ${ECM_KDE_MODULE_DIR} ${CMAKE_MODULE_PATH})

include(KDEInstallDirs)
include(KDEPackageAppTemplates)

set(dolphinservicemenus_DIRS
        dolphinservicemenus
)

kde_package_app_templates(TEMPLATES ${dolphinservicemenus_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})
