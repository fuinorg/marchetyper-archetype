#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
#set( $delim = '.,_-/' )
#set( $empty = '' )
#set( $StringUtils = $empty.class.forName('org.codehaus.plexus.util.StringUtils') )
#set( $pkgPath = $StringUtils.replace($pkgName, ".", "/") )
${symbol_pound} ${appName} Archetype
Archetype that creates a new ${appName} Maven project.

${symbol_pound}${symbol_pound} Generate

${symbol_pound}${symbol_pound}${symbol_pound} Mandatory Parameters
```
mvn archetype:generate ${symbol_escape}
     -DarchetypeGroupId=org.fuin.archetypes ${symbol_escape}
     -DarchetypeArtifactId=${artifactId} ${symbol_escape}
     -DarchetypeVersion=${version}
```

${symbol_pound}${symbol_pound}${symbol_pound} All Parameters
```
mvn archetype:generate ${symbol_escape}
     -DarchetypeGroupId=org.fuin.archetypes ${symbol_escape}
     -DarchetypeArtifactId=${artifactId} ${symbol_escape}
     -DarchetypeVersion=${version} ${symbol_escape}
     -DgroupId="com.example.archetypes" ${symbol_escape}
     -DartifactId="abc-archetype" ${symbol_escape}
     -Dversion="${version}" ${symbol_escape}
     -DpkgName="com.example.archetypes.abc" ${symbol_escape}
     -DappName="Abc"
```

${symbol_pound}${symbol_pound}${symbol_pound} Explanation

| Variable     | Default                    | Description                        |
|:-------------|:---------------------------|:-----------------------------------|
| groupId      | com.example.archetypes     | Your archetype's Group ID          |
| artifactId   | abc-archetype              | Your archetype's Artifact ID       |
| version      | ${version}             | Your archetype's version           |
| pkgName      | com.example.archetypes.abc | The base package of your archetype |
| appName      | Abc                        | Camelcase name of your archetype   |

${symbol_pound}${symbol_pound}${symbol_pound} Tips
In case you're developing a new version of this archetype and you want to build and test it locally, you need to tell Maven about it:
```
mvn archetype:generate ${symbol_escape}
     -DarchetypeGroupId=org.fuin.archetypes ${symbol_escape}
     -DarchetypeArtifactId=${artifactId} ${symbol_escape}
     -DarchetypeVersion=${version} ${symbol_escape}
     ...
     -DarchetypeCatalog=local
```
The `-DarchetypeCatalog=local` enables Maven to use the locally installed Archetype.
