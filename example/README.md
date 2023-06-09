# xyz-archetype
Generates the Xyz Archetype.

## Modules
- **[archetype](archetype)** - The generated Maven Archetype project. This will be used to bootstrap a new project via `mvn archetype:generate` plus some parameters.
- **[example](example)** - The source example project to create a Maven Archetype from.
- **[marchetyper](marchetyper)** - The plugin that converts from example to archetype.

## Build
In the root directory simply run a maven build:
```
mvn clean install
```

This will delete the content of the [archetype](archetype) directory and recreate it with the converted content of the [example](example) project.

The conversion is configured with the [marchetyper-config.xml](marchetyper/marchetyper-config.xml) file.

## Archetype
The generated archetype has a detailed description on how to use it: [README.md](marchetyper/extra-resources/README.md).

