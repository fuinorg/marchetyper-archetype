#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
#set( $delim = '.,_-/' )
#set( $empty = '' )
#set( $StringUtils = $empty.class.forName('org.codehaus.plexus.util.StringUtils') )
#set( $pkgPath = $StringUtils.replace($pkgName, ".", "/") )
${symbol_pound} ${appName} Example
Here goes your code to create a Maven Archetype of.