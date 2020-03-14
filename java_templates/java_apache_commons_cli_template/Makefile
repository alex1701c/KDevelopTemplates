start:
	mvn compile exec:java -Dexec.args="$(args)"
build:
	mvn compile package
clean:
	mvn clean

package-appimage:
	# Build appimage, build required jar file first
	mvn compile assembly:single
	./pkg2appimage recipies/%{APPNAMELC}-java11openjdk.yml
	cd ./%{APPNAME} && ./appimagetool %{APPNAME}.AppDir/

package-appimage-modular:
	# Build appimage, build required jar file first
	mvn compile assembly:single
	./pkg2appimage recipies/%{APPNAMELC}-java11openjdkmodular.yml
	cd ./%{APPNAME} && ./appimagetool %{APPNAME}.AppDir/
