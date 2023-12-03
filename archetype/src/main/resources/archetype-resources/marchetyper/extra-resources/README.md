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
     -DarchetypeGroupId=${groupId} ${symbol_escape}
     -DarchetypeArtifactId=${artifactId} ${symbol_escape}
     -DarchetypeVersion=${version}
```

${symbol_pound}${symbol_pound}${symbol_pound} All Parameters
```
mvn archetype:generate ${symbol_escape}
     -DarchetypeGroupId=${groupId} ${symbol_escape}
     -DarchetypeArtifactId=${artifactId} ${symbol_escape}
     -DarchetypeVersion=${version} ${symbol_escape}
     -DgroupId="com.example" ${symbol_escape}
     -DartifactId="abc" ${symbol_escape}
     -Dversion="0.1.0-SNAPSHOT" ${symbol_escape}
     -DpkgName="com.example.abc" ${symbol_escape}
     -DappName="Abc"
```

${symbol_pound}${symbol_pound}${symbol_pound} Explanation

| Variable     | Default                    | Description                  |
|:-------------|:---------------------------|:-----------------------------|
| groupId      | com.example                | Your apps's Group ID         |
| artifactId   | abc                        | Your apps's Artifact ID      |
| version      | 0.1.0-SNAPSHOT             | Your app's version           |
| pkgName      | com.example.abc            | The base package of your app |
| appName      | Abc                        | Camelcase name of your app   |

${symbol_pound}${symbol_pound}${symbol_pound} Tips
In case you're developing a new version of this archetype and you want to build and test it locally, you need to tell Maven about it:
```
mvn archetype:generate ${symbol_escape}
     -DarchetypeGroupId=${groupId} ${symbol_escape}
     -DarchetypeArtifactId=${artifactId} ${symbol_escape}
     -DarchetypeVersion=${version} ${symbol_escape}
     ...
     -DarchetypeCatalog=local
```
The `-DarchetypeCatalog=local` enables Maven to use the locally installed Archetype.
