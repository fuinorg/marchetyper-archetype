# marchetyper-archetype
Generates a Maven Archetype that creates a [marchetyper](https://github.com/fuinorg/marchetyper) based project.

[![Java Maven Build](https://github.com/fuinorg/marchetyper-archetype/actions/workflows/maven.yml/badge.svg)](https://github.com/fuinorg/marchetyper-archetype/actions/workflows/maven.yml)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.fuin/marchetyper-archetype/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.fuin/marchetyper-archetype/)
[![LGPLv3 License](http://img.shields.io/badge/license-LGPLv3-blue.svg)](https://www.gnu.org/licenses/lgpl.html)
[![Java Development Kit 11](https://img.shields.io/badge/JDK-11-green.svg)](https://openjdk.java.net/projects/jdk/11/)

## Getting started
Create your own Maven Archetype project: See [archetype](archetype) for a description on how to genenerate a new project.

## Modules
- **[archetype](archetype)** - The generated Maven Archetype project. This will be used to bootstrap a new project via `mvn archetype:generate` plus some parameters.
- **[example](example)** - The source example project to create a Maven Archetype from.
- **[marchetyper-archetype](marchetyper-archetype)** - The plugin that converts from example to archetype.

## Build
In the root directory simply run a maven build:
```
mvn clean install
```

This will delete the content of the [archetype](archetype) directory and recreate it with the converted content of the [example](example) project.

The conversion is configured with the [marchetyper-archetype-config.xml](marchetyper-archetype/marchetyper-archetype-config.xml) file.

## Archetype
The generated archetype has a detailed description on how to use it: [README.md](marchetyper/extra-resources/README.md).