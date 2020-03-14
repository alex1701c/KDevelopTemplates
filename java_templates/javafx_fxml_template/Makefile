compile:
	make copy_resources
	javac -d build -sourcepath src src/main/Main.java src/main/Controller.java
copy_resources:
	mkdir -p build/main
	cp src/main/sample.fxml build/main
start:
	java -cp build main.Main
clean:
	rm -rf build
	rm -rf bin
start_dev:
	make compile start
package:
	make clean
	make compile
	mkdir -p bin
	echo "Main-Class: main.Main" > build/MANIFEST.MF
	jar -cfm bin/project.jar build/MANIFEST.MF -C build/ .
	chmod +x bin/project.jar
