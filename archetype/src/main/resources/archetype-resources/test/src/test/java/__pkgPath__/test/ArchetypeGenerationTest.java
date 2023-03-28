#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
#set( $delim = '.,_-/' )
#set( $empty = '' )
#set( $StringUtils = $empty.class.forName('org.codehaus.plexus.util.StringUtils') )
#set( $pkgPath = $StringUtils.replace($pkgName, ".", "/") )
package ${pkgName}.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.maven.shared.verifier.VerificationException;
import org.apache.maven.shared.verifier.Verifier;
import org.fuin.marchetyper.core.Config;
import org.fuin.marchetyper.core.ConfigImpl;
import org.fuin.marchetyper.core.DirectoryCompare;
import org.junit.jupiter.api.Test;

/**
 * Tests the archetype generation.
 */
public class ArchetypeGenerationTest {

    @Test
    public void testGenerate() throws VerificationException, IOException {

        // PREPARE
        final File configFile = new File("../marchetyper/marchetyper-config.xml");
        final Config config = ConfigImpl.load(configFile);
        final File srcDir = new File("../example");
        final File tmpDir = new File("target/" + this.getClass().getSimpleName());
        if (tmpDir.exists()) {
            FileUtils.deleteDirectory(tmpDir);
        }
        tmpDir.mkdirs();

        final Verifier generateVerifier = new Verifier(tmpDir.getAbsolutePath());
        generateVerifier.setAutoclean(false);

        final List<String> args = new ArrayList<>();
        args.add("archetype:generate");
        args.addAll(config.getArchetype().toArchetypeGenerateArgs());
        generateVerifier.addCliArguments(args.toArray(new String[args.size()]));

        // TEST
        generateVerifier.execute();

        // VERIFY
        generateVerifier.verifyErrorFreeLog();
        new DirectoryCompare(config).verify(srcDir, tmpDir);

    }

}
