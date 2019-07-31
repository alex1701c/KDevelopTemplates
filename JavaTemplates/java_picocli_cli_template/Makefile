start:
	mvn compile exec:java -Dexec.args="$(args)"
build:
	mvn compile assembly:single
clean:
	mvn clean
	rm -rf bin
test:
	mvn test
install:
	chmod +x target/%{APPNAMELC}-*-jar-with-dependencies.jar
	mkdir -p bin
	cp target/%{APPNAMELC}-*-jar-with-dependencies.jar bin
autocomplete:
	java -cp target/%{APPNAMELC}-1.0-jar-with-dependencies.jar picocli.AutoComplete -n %{APPNAMELC}-1.0-jar-with-dependencies.jar  main.Args --force
deploy:
	make clean build test install
