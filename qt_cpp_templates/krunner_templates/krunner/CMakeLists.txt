set(basic_runner_template_DIRS basic_runner)
set(extended_runner_template_DIRS extended_runner)

kde_package_app_templates(TEMPLATES ${basic_runner_template_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})
kde_package_app_templates(TEMPLATES ${extended_runner_template_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})
