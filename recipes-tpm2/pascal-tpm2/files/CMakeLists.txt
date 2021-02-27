cmake_minimum_required(VERSION 3.16)
project(pascal-tpm2)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

FIND_PACKAGE(Threads REQUIRED)
FIND_PACKAGE(OpenSSL REQUIRED)

add_executable(tpm2-pascal main.cpp)
target_link_libraries(tpm2-pascal pthread tss2-fapi crypto json-c)
install(TARGETS tpm2-pascal DESTINATION bin)
