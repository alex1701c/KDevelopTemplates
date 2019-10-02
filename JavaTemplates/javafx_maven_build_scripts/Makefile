start:
	mvn compile exec:java
test:
	mvn test
clean:
	rm -rf target/*
	rm -rf %{APPNAME}/*
	rm -rf dist/*
package-standalone-deb_rpm:
	mvn jfx:native
package-appimage:
	./pkg2appimage recipies/%{APPNAMELC}-javafxpackager.yml
	cd ./%{APPNAME} && ./appimagetool %{APPNAME}.AppDir/
package-appimage-download-jre:
	apt download openjdk-11-jre-headless
	mv openjdk-11-jre-headless*.deb openjdk-11-jre-headless.deb
	ar vx openjdk-11-jre-headless.deb
	rm control.tar.xz  debian-binary openjdk-11-jre-headless*.deb
	mv data.tar.xz openjdk-11-jre.tar.xz
package-all:
	mvn clean compile package jfx:native
	make package-appimage
	mkdir -p dist
	mv %{APPNAME}/*.AppImage dist/
	mv target/jfx/native/%{APPNAMELC}-*.deb dist/
	mv target/jfx/native/%{APPNAMELC}-*.rpm dist/
	mv target/%{APPNAMELC}-*-jar-with-dependencies.jar dist
	chmod +x dist/*
