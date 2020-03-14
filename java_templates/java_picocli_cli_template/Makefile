start:
	mvn compile exec:java -Dexec.args="$(args)"
build:
	mvn compile package
	make autocomplete
clean:
	mvn clean
	rm -rf bin
test:
	mvn test
autocomplete:
	java -cp target/%{APPNAMELC}-1.0-jar-with-dependencies.jar picocli.AutoComplete -n %{APPNAMELC}-1.0-jar-with-dependencies.jar  main.Args --force

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