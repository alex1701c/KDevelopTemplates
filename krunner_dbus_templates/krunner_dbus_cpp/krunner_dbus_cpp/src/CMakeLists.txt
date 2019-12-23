set(%{APPNAMELC}_SRCS %{APPNAMELC}.cpp)

qt5_add_dbus_adaptor(%{APPNAMELC}_SRCS "/usr/share/dbus-1/interfaces/kf5_org.kde.krunner1.xml" %{APPNAMELC}.h %{APPNAME})

add_executable(%{APPNAMELC} ${%{APPNAMELC}_SRCS})
target_link_libraries(%{APPNAMELC}
    Qt5::DBus
    KF5::Runner
)
# TODO Change
install(FILES %{APPNAMELC}.desktop DESTINATION ~/.local/share/kservices5/)
# TODO Create autostart if release type