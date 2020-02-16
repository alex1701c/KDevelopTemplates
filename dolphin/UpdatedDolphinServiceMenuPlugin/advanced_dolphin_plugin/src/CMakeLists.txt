add_definitions(-DTRANSLATION_DOMAIN=\"%{APPNAMELC}\")

set(%{APPNAMELC}_SRCS %{APPNAMELC}.cpp)
kcoreaddons_add_plugin(%{APPNAMELC} SOURCES ${%{APPNAMELC}_SRCS} INSTALL_NAMESPACE "kf5/kfileitemaction")
kcoreaddons_desktop_to_json(%{APPNAMELC} %{APPNAMELC}.desktop) # generate the json file
target_link_libraries(%{APPNAMELC} KF5::KIOCore KF5::KIOWidgets)

install(FILES %{APPNAMELC}.desktop DESTINATION ${KDE_INSTALL_KSERVICES5DIR})
install(TARGETS %{APPNAMELC} DESTINATION ${PLUGIN_INSTALL_DIR}/kf5/kfileitemaction)
