# Software Configuration Management #

**EDUCATION Repository**

## Calculator Example ##

("Complete") Example for demonstration of different Software Configuration Skills.

| Content           | Technology                                | important entry point                     |
| ----------------- |:----------------------------------------: | -----------------------------------------:|
| Build Automation  | Maven                                     | [Project Object Model](pom.xml)                                   |
| Source Code       | Java                                      |   `src/main/java/<package>/<Class>`       |
| Test Automation   | JUnit 5                                   |   `src/test/java/<package>/<Test-Class>`  |
| Documentation     | Markdown, JavaDoc, Standard Comments,...  | inline and `src/site/`                    |
| Versioning        | Git and GitHub                            | [github.com](https://github.com/michaelulm/software-configuration-management/tree/master/exercises) |

## How to use this Example Project ##

The Calculator Example has a reduced complexity for an easy guide through important parts of a Java Software Development Project.

### Installation ###

Two possibilities to run this project successfully:
* a) Install an IDE which supports Maven Projects e.g. IntelliJ
* b) Download and Extract / Install Maven and a JDK

### Configuration ###

Depending on which possibility you have chosen

**a) IDE e.g. IntelliJ**
* Open the root directory of this project within your IDE
* "magic" happens automatically
* choose run options or Step(s) of Maven Lifecycle
  

**b) Maven and JDK**
* Configure your path Variables
* Test with `mvn -version` and `javac -version`
* run Step(s) of Maven Lifecycle in your Console / Terminal e.g. `mvn test`

### Template Project ###

This Project could be used as some kind as a Template Project. Try to compare Structure, Content, Tests, and some other parts with your current projects. This project is only an additional introduction and reduced Development project to learn important parts of Maven, JUnit, Documentation, and some other stuff.


## Important parts of a Java Software Development Project ##

### Versioning ###

Git is used for Source Code Versioning. Sometimes it could be really tricky, e.g.

**which files should be includes to the repository**? It's easier to say, which files should not be under versioning control. with the [.gitignore File](https://github.com/github/gitignore) it's possible to "ignore" such not necessary file because of different reasons.  Feel free to extend and take care about add files to the repository


### Build Automation ###

Maven is used to manage complete project by [single file](pom.xml), directory layout and naming conventions. If you are using existing pom.xml, identify not necessary parts or parts which has to be replaced, extended or modified by your needs. Also other "Templates" should be go through really well and cleanup for your purposes.

More about [Project Structure](src/site/markdown/Project-Structure.md).


### Test Automation ###

Tests are written in JUnit 5 and are possible to run within Intellij or with Maven Command Line Interface. Both variants have different benefits.

Try to discover Test Coverage at both variants to run your current JUnit Test 

More about [JUnit Tests](src/site/markdown/JUnit-Tests.md).

### Documentation ###

More about [Maven Site](https://maven.apache.org/guides/mini/guide-site.html) Documentation
                   
Useful to reload all dependencies

    mvn dependency:purge-local-repository -DreResolve=false


**TODO Try to answer following questions**
1. Why do we need any documentation at all?
2. Why is it good to have a well written README file?
3. What are the benefits of a well structured documentation? Who will need this and why?
4. What are the benefits to write JavaDoc within Implementation Classes instead of Interfaces? (further question to think about)


**useful Links for Documentation** 
* Maven Site
  * [Creating Content](https://maven.apache.org/plugins/maven-site-plugin/examples/creating-content.html)
  * [Configuring Site Descriptor](https://maven.apache.org/plugins/maven-site-plugin/examples/sitedescriptor.html)
  * [Markup Formats](https://maven.apache.org/doxia/references/index.html)
* The [README Checklist](https://github.com/noffle/art-of-readme#bonus-the-readme-checklist)
* [Make a README](https://www.makeareadme.com/) (why, who, when, where, ...)
* [Documentation System](https://documentation.divio.com/)

Take care about licences! Do honor to Authors, Contributors, ... and mention them at Credits, Footnotes, References.
