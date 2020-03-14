set(basic_cli_template_DIRS basic_qt_cli_template)
set(validated_cli_template_DIRS validated_qt_cli_template)

kde_package_app_templates(TEMPLATES ${basic_cli_template_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})
kde_package_app_templates(TEMPLATES ${validated_cli_template_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})
