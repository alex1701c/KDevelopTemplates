compile:
	mkdir -p build
	javac -d build -sourcepath src src/main/Main.java
start:
	java -cp build main.Main
clean:
	rm -rf build
	rm -rf bin
start_dev:
	make compile start
package:
	mkdir -p build
	mkdir -p bin
	javac -d build -sourcepath src src/main/Main.java
	echo "Main-Class: main.Main" > build/MANIFEST.MF
	jar -cfm bin/project.jar build/MANIFEST.MF -C build/ .
	chmod +x bin/project.jar
