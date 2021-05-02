rmdir /S/Q build
del HelloWorld.jar
del HelloWorldRunnable.jar
mkdir build
mkdir build\classes

javac src\main\java\at\fhj\iit\Main.java -d build\classes
java -cp build\classes\ at.fhj.iit.Main test
jar cvf HelloWorld.jar at.fhj.iit.Main -C build/classes .
jar cvfm HelloWorldRunnable.jar src/main/resources/manifest.txt -C build/classes .
java -jar HelloWorldRunnable.jar test