cmake_minimum_required(VERSION 3.0)
include(FeatureSummary)
find_package(ECM ${KF5_MIN_VERSION} REQUIRED NO_MODULE)
set(CMAKE_MODULE_PATH ${ECM_MODULE_PATH} ${ECM_KDE_MODULE_DIR} ${CMAKE_MODULE_PATH})

include(KDEInstallDirs)
include(KDEPackageAppTemplates)

set(kdevelop_app_template_DIRS kdevelop_app_template)
set(kdevelop_file_template_DIRS kdevelop_file_template)
set(simple_desktop_application_file_DIRS simple_desktop_application_file)

kde_package_app_templates(TEMPLATES ${kdevelop_app_template_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})
kde_package_app_templates(TEMPLATES ${kdevelop_file_template_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})
kde_package_app_templates(TEMPLATES ${simple_desktop_application_file_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})


add_subdirectory(dolphin)
add_subdirectory(krunner_dbus_templates)
add_subdirectory(qt_cpp_templates)
add_subdirectory(java_templates)
add_subdirectory(python_templates)
