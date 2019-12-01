build-executable:
	mkdir -p build
	cd build; \
	cmake ..; \
	make -j4

package-deb:
	cd build; \
	cpack -G DEB

package-rpm:
	cd build; \
	cpack -G RPM

build-packages:
	rm -rf build
	mkdir -p build
	cd build; \
	cmake -D CMAKE_INSTALL_PREFIX=/usr -DCMAKE_BUILD_TYPE=Release ..; \
	make -j4; \
	make package-deb
	make package-rpm
