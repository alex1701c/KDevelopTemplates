add_definitions(-DTRANSLATION_DOMAIN=\"plasma_runner_org.kde.%{APPNAMELC}\")

set(%{APPNAMELC}_SRCS %{APPNAMELC}.cpp)

add_library(krunner_%{APPNAMELC} MODULE ${%{APPNAMELC}_SRCS})
target_link_libraries(krunner_%{APPNAMELC} KF5::Runner KF5::I18n)

set(kcm_krunner_%{APPNAMELC}_SRCS
        config/%{APPNAMELC}_config.cpp
        )

ki18n_wrap_ui(kcm_krunner_%{APPNAMELC}_SRCS config/%{APPNAMELC}_config.ui)
add_library(kcm_krunner_%{APPNAMELC} MODULE ${kcm_krunner_%{APPNAMELC}_SRCS})
target_link_libraries(kcm_krunner_%{APPNAMELC}
        Qt5::Core
        Qt5::Gui
        KF5::CoreAddons
        KF5::ConfigCore
        KF5::I18n
        KF5::ConfigWidgets
        KF5::Runner
        )

add_dependencies(krunner_%{APPNAMELC} kcm_krunner_%{APPNAMELC})


install(TARGETS krunner_%{APPNAMELC} kcm_krunner_%{APPNAMELC} DESTINATION ${PLUGIN_INSTALL_DIR})
install(FILES plasma-runner-%{APPNAMELC}.desktop config/plasma-runner-%{APPNAMELC}_config.desktop DESTINATION ${KDE_INSTALL_KSERVICES5DIR})
