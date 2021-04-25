# Software Configuration Management #

## Hello World ###

This Example will introduce you to the basics of some major parts of Software Configuration Management.

### manually build the project ###

The major goal of each software development project is to create a release for customers, other developers or any other person who is interested to run the current project.

#### clean generated files

    rmdir /S/Q build
    rm HelloWorld.jar
    rm HelloWorldRunnable.jar

#### create needed structure

    mkdir build
    mkdir build\classe

#### compile sources

	javac src\main\java\at\fhj\iit\Main.java -d build\classes

#### run project

	java -cp build\classes\ at.fhj.iit.Main test

#### create artifact
    jar cvf HelloWorld.jar at.fhj.iit.Main -C build/classes .
    jar cvfm HelloWorldRunnable.jar src/main/resources/manifest.txt -C build/classes .


### more automation needed
all those manually steps could be run within a Maven Project with default tasks of Maven Lifecycle. It's good and necessary to know which steps will happen within those steps in Maven Lifecycle

for a simple project like `Hello World` Example a simple `build.bat` would be enough but will not fit the needs of CRISP

pom.xml will help us to define e.g. output Directory after package creation to use within other demo project [Hello-World-Test](../Hello-World-Test) . Normally tests within the project itself, but in this case for demonstration purpose we will exclude test cases to another project to show how to integrate generated jar file to use within other Maven Project.