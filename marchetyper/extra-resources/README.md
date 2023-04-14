# Marchetyper Archetype
Archetype that creates a new Maven project with the suggested directory structure for using the [marchetyper](https://github.com/fuinorg/marchetyper) tool.

## Generate

### Mandatory Parameters
```
mvn archetype:generate \
     -DarchetypeGroupId=org.fuin.archetypes \
     -DarchetypeArtifactId=marchetyper-archetype \
     -DarchetypeVersion=0.3.0-SNAPSHOT
```

### All Parameters
```
mvn archetype:generate \
     -DarchetypeGroupId=org.fuin.archetypes \
     -DarchetypeArtifactId=marchetyper-archetype \
     -DarchetypeVersion=0.3.0-SNAPSHOT \
     -DgroupId="com.example.archetypes" \
     -DartifactId="abc-archetype" \
     -Dversion="0.1.0-SNAPSHOT" \
     -DpkgName="com.example.archetypes.abc" \
     -DappName="Abc" \
```

### Explanation

| Variable     | Default                    | Description                        |
|--------------|----------------------------|------------------------------------|
| groupId      | com.example.archetypes     | Your archetype's Group ID          |
| artifactId   | abc-archetype              | Your archetype's Artifact ID       |
| version      | 0.1.0-SNAPSHOT             | Your archetype's version           |
| pkgName      | com.example.archetypes.abc | The base package of your archetype |
| appName      | Abc                        | Camelcase name of your archetype   |

### Tips
In case you're developing a new version of the Archetype and want to build and test it locally, you need to tell Maven about it:
```
mvn archetype:generate \
     -DarchetypeGroupId=org.fuin.archetypes \
     -DarchetypeArtifactId=marchetyper-archetype \
     -DarchetypeVersion=0.3.0-SNAPSHOT \
     ...
     -DarchetypeCatalog=local
```
The `-DarchetypeCatalog=local` enables Maven to use the locally installed Archetype.
