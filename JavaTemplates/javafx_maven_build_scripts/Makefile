start:
	mvn compile exec:java
test:
	mvn test
clean:
	rm -rf target/*
	rm -rf %{APPNAME}/*
package-javafxpackager:
	# Files get created in target/jfx/native/%{APPNAMELC}
	# This requires the oracle java8 jdk
	export JAVA_HOME="/usr/lib/jvm/java-8-oracle/"; mvn jfx:native
package-appimage:
	# Build appimage, build required jar file first
	mvn compile assembly:single
	./pkg2appimage recipies/%{APPNAMELC}-java11openjdk.yml
	cd ./%{APPNAME} && ./appimagetool %{APPNAME}.AppDir/
package-jar-deb:
	# Builds standalone jar and deb package
	mvn compile package
