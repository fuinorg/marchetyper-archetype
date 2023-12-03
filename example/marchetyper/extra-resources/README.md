# Xyz Archetype
Archetype that creates a new Xyz Maven project.

## Generate

### Mandatory Parameters
```
mvn archetype:generate \
     -DarchetypeGroupId=org.fuin.archetypes \
     -DarchetypeArtifactId=xyz-archetype \
     -DarchetypeVersion=0.1.0-SNAPSHOT
```

### All Parameters
```
mvn archetype:generate \
     -DarchetypeGroupId=org.fuin.archetypes \
     -DarchetypeArtifactId=xyz-archetype \
     -DarchetypeVersion=0.1.0-SNAPSHOT \
     -DgroupId="com.example" \
     -DartifactId="abc" \
     -Dversion="0.1.0-SNAPSHOT" \
     -DpkgName="com.example.abc" \
     -DappName="Abc"
```

### Explanation

| Variable     | Default                    | Description                  |
|:-------------|:---------------------------|:-----------------------------|
| groupId      | com.example                | Your apps's Group ID         |
| artifactId   | abc                        | Your apps's Artifact ID      |
| version      | 0.1.0-SNAPSHOT             | Your app's version           |
| pkgName      | com.example.abc            | The base package of your app |
| appName      | Abc                        | Camelcase name of your app   |

### Tips
In case you're developing a new version of this archetype and you want to build and test it locally, you need to tell Maven about it:
```
mvn archetype:generate \
     -DarchetypeGroupId=org.fuin.archetypes \
     -DarchetypeArtifactId=xyz-archetype \
     -DarchetypeVersion=0.1.0-SNAPSHOT \
     ...
     -DarchetypeCatalog=local
```
The `-DarchetypeCatalog=local` enables Maven to use the locally installed Archetype.
