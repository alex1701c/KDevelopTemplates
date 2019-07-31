cmake_minimum_required(VERSION 3.0)

include(FeatureSummary)

find_package(ECM ${KF5_MIN_VERSION} REQUIRED NO_MODULE)
set(CMAKE_MODULE_PATH ${ECM_MODULE_PATH} ${ECM_KDE_MODULE_DIR} ${CMAKE_MODULE_PATH})

include(KDEInstallDirs)
include(KDEPackageAppTemplates)

set(template_DIRS
    PythonArgparseProject
)

set(typed_template_DIRS
    PythonArgparseTypedProject
)

set(modular_typed_template_DIRS
    PythonArgparseTypedModularProject
)

kde_package_app_templates(TEMPLATES ${template_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})
kde_package_app_templates(TEMPLATES ${typed_template_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})
kde_package_app_templates(TEMPLATES ${modular_typed_template_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})