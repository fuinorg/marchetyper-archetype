# marchetyper-archetype
Generates a Maven Archetype that creates a [marchetyper](https://github.com/fuinorg/marchetyper) based project.

[![Java Maven Build](https://github.com/fuinorg/marchetyper-archetype/actions/workflows/maven.yml/badge.svg)](https://github.com/fuinorg/marchetyper-archetype/actions/workflows/maven.yml)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.fuin.archetypes/marchetyper-archetype/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.fuin.archetypes/marchetyper-archetype/)
[![LGPLv3 License](http://img.shields.io/badge/license-LGPLv3-blue.svg)](https://www.gnu.org/licenses/lgpl.html)
[![Java Development Kit 11](https://img.shields.io/badge/JDK-11-green.svg)](https://openjdk.java.net/projects/jdk/11/)

## Getting started
Now you have a nice project you want to create a [Maven Archetype](https://maven.apache.org/guides/introduction/introduction-to-archetypes.html) from.

Here are the steps to create the necessary project structure and add your example to it:

### Select the coordinates for your project
Let's assume you have created a nice Java FX project you want to use for an Archetype.
The following parameters may be a good choice for creating the new archetype:

| Variable     | Your value                      | Description                        |
|--------------|---------------------------------|------------------------------------|
| groupId      | com.mycompany.archetypes        | Your archetype's Group ID          |
| artifactId   | java-fx-archetype               | Your archetype's Artifact ID       |
| version      | 0.1.0-SNAPSHOT                  | Your archetype's version           |
| pkgName      | com.mycompany.archetypes.javafx | The base package of your archetype |
| appName      | JavaFX                          | Camelcase name of your app         |


### Generate the directory structure
```
mvn archetype:generate \
     -DarchetypeGroupId=org.fuin.archetypes \
     -DarchetypeArtifactId=marchetyper-archetype \
     -DarchetypeVersion=0.2.0 \
     -DgroupId="com.mycompany.archetypes" \
     -DartifactId="java-fx-archetype" \
     -Dversion="0.1.0-SNAPSHOT" \
     -DpkgName="com.mycompany.archetypes.javafx" \
     -DappName="JavaFX" \
```
:warning: Make sure to use the latest stable version from Maven Central for the **archetypeVersion** (See top of the page).

### Copy your example into the new project
The new project structure looks like this:

- **archetype** - The code for the generated archetype will be stored in this directory
- **example** <--- Copy your example project into this directory (The 'pom.xml' should **not** reference the parent POM - The project is completely independent of the other modules)
- **marchetyper** - Contains the plugin and configuration that transforms the `example` folder into the `archetype` directory
- **test** - Contains code to test the final archetype by generating a test project

### Adjust the configuration
Open the [marchetyper](https://github.com/fuinorg/marchetyper) configuration: `marchetyper/marchetyper-config.xml` and adjust it to match your project.
Basically you define the search and replace operations for your example project.
See the [configuration](https://github.com/fuinorg/marchetyper#configuration) section for more information.

### Run the build
Execute `mvn clean install` in the top folder of the project.

### Verify the archetype
Take a look at the `archetype` directory and check if all parts have been replaced with variables like "__path__" (for path or file names) and "${artifactId}" inside the files. In case there are things that are not OK, adjust the `marchetyper/marchetyper-config.xml` and run the build again.

In case your archetype looks good, you should generate a new project with the archetype:

```
mvn archetype:generate \
     -DarchetypeGroupId=com.mycompany.archetypes \
     -DarchetypeArtifactId=java-fx-archetype \
     -DarchetypeVersion=0.1.0-SNAPSHOT \
     ...
     -DarchetypeCatalog=local
```
It will create a new directory named 'java-fx-archetype' with the project generated with your archetype.

Open the project and verify that it meets your expectation. In case it does not, repeat the change/build/test cycle.


## Build
See [BUILD.md](BUILD.md) for information about building this project.
