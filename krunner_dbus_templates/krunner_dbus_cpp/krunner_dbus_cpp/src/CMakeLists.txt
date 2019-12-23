set(%{APPNAMELC}_SRCS %{APPNAMELC}.cpp)

qt5_add_dbus_adaptor(%{APPNAMELC}_SRCS "/usr/share/dbus-1/interfaces/kf5_org.kde.krunner1.xml" %{APPNAMELC}.h %{APPNAME})

add_executable(%{APPNAMELC} ${%{APPNAMELC}_SRCS})
target_link_libraries(%{APPNAMELC}
    Qt5::DBus
    KF5::Runner
)

set(CMAKE_BINARY_DIR "../bin")
set(EXECUTABLE_OUTPUT_PATH ${CMAKE_BINARY_DIR})

install(FILES %{APPNAMELC}.desktop DESTINATION ~/.local/share/kservices5/)
if(CMAKE_BUILD_TYPE STREQUAL "Release")
    install(TARGETS %{APPNAMELC} DESTINATION ~/.config/autostart-scripts/)
endif()