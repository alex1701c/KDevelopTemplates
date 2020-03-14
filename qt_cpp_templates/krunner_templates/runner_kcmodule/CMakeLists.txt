set(template_DIRS runnerwithconfig)
set(extendedTemplate_DIRS extendedrunnerwithconfig)

kde_package_app_templates(TEMPLATES ${template_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})
kde_package_app_templates(TEMPLATES ${extendedTemplate_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})
