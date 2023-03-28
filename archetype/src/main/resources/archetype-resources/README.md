#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
#set( $delim = '.,_-/' )
#set( $empty = '' )
#set( $StringUtils = $empty.class.forName('org.codehaus.plexus.util.StringUtils') )
#set( $pkgPath = $StringUtils.replace($pkgName, ".", "/") )
${symbol_pound} ${artifactId}
Generates the ${appName} Archetype.

${symbol_pound}${symbol_pound} Modules
- **[archetype](archetype)** - The generated Maven Archetype project. This will be used to bootstrap a new project via `mvn archetype:generate` plus some parameters.
- **[example](example)** - The source example project to create a Maven Archetype from.
- **[marchetyper](marchetyper)** - The plugin that converts from example to archetype.

${symbol_pound}${symbol_pound} Build
In the root directory simply run a maven build:
```
mvn clean install
```

This will delete the content of the [archetype](archetype) directory and recreate it with the converted content of the [example](example) project.

The conversion is configured with the [marchetyper-config.xml](marchetyper/marchetyper-config.xml) file.

${symbol_pound}${symbol_pound} Archetype
The generated archetype has a detailed description on how to use it: [README.md](marchetyper/extra-resources/README.md).

