# Software Configuration Management #

## Hello World Test ###

This Example will introduce you to the basics of some major parts of Software Configuration Management. We will integrate the generated Jar File of [Hello-World](../Hello-World) to show how to use external libraries within your own projects. at Maven Projects it's possible to load external dependencies by [Maven Repository](https://mvnrepository.com/) or local dependencies of own created libraries. Also some "older" projects are not available at Maven Repository, but in most cases you will find popular libraries there.

pom.xml will help load Jar File of Hello World Demo Project. But first you have to run `mvn package` within [Hello-World](../Hello-World) project. This will generate a jar file within your Hello World Test Project, where maven will load this Jar File as a Project dependency which is configured at your pom.xml


    <build>
        <plugins>
            
			...
			
            <plugin>
                <!-- Build an executable JAR -->

				...

                <configuration>	
				
					...

                    <!-- will create package at specific directory, just for demonstration JAR usage -->
                    <outputDirectory>../Hello-World-Test/src/main/resources/</outputDirectory>

                </configuration>
			</plugin>
		</plugins>
	</build>