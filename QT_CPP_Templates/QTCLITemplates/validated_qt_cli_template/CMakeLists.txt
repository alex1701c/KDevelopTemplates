cmake_minimum_required(VERSION 3.0)

project(%{APPNAMELC})

set(QT_MIN_VERSION "5.2")
set(CMAKE_INCLUDE_CURRENT_DIR ON)
set(CMAKE_AUTOMOC ON)

find_package(Qt5 ${QT_MIN_VERSION} REQUIRED Core )

add_executable(${PROJECT_NAME} main.cpp Validator.cpp Validator.h)

target_link_libraries(${PROJECT_NAME} Qt5::Core)

# TODO Replace with your own path
install(TARGETS ${PROJECT_NAME} DESTINATION ${CMAKE_CURRENT_LIST_DIR}/bin)