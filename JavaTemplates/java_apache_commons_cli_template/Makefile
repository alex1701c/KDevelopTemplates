start:
	mvn compile exec:java -Dexec.args="$(args)"
build:
	mvn compile assembly:single
clean:
	mvn clean
	rm -rf bin
install:
	chmod +x target/%{APPNAMELC}-*-jar-with-dependencies.jar
	mkdir -p bin
	cp target/%{APPNAMELC}-*-jar-with-dependencies.jar bin
deploy:
	make clean build install