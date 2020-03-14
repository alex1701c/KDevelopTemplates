set(template_DIRS PythonArgparseProject)
set(typed_template_DIRS PythonArgparseTypedProject)
set(modular_typed_template_DIRS PythonArgparseTypedModularProject)

kde_package_app_templates(TEMPLATES ${template_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})
kde_package_app_templates(TEMPLATES ${typed_template_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})
kde_package_app_templates(TEMPLATES ${modular_typed_template_DIRS} INSTALL_DIR ${KDE_INSTALL_KTEMPLATESDIR})
