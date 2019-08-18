start:
	mvn compile exec:java
test:
	mvn test
clean:
	rm -rf target/*
	rm -rf %{APPNAME}/*
	rm -rf dist/*
package-jar:
	mvn compile assembly:single
package-deb_rpm:
	mvn jfx:native
package-appimage:
	./pkg2appimage recipies/%{APPNAMELC}.yml
	cd ./%{APPNAME} && ./appimagetool %{APPNAME}.AppDir/
package-all:
	make package-deb_rpm package-appimage package-jar
	mkdir -p dist
	mv %{APPNAME}/My_Java_App-x86_64.AppImage dist/
	mv target/jfx/native/%{APPNAMELC}-*.deb dist/
	mv target/jfx/native/%{APPNAMELC}-*.rpm dist/
	mv target/%{APPNAMELC}-*-jar-with-dependencies.jar dist
	chmod +x dist/*
