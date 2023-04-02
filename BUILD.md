# marchetyper-archetype
Generates a Maven Archetype that creates a [marchetyper](https://github.com/fuinorg/marchetyper) based project.

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
