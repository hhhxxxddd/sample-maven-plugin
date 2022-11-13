package priv.hhhxxxddd.plugin;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * ▣ 测试
 *
 * @author hhhxxxddd
 * @since 2022-11-12 02:44
 */
class SamplePluginTest {
    SamplePlugin samplePlugin = new SamplePlugin();

    /**
     * 测试打印
     */
    @Test
    void testExecute() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        try {
            samplePlugin.execute();
        } catch (MojoExecutionException | MojoFailureException e) {
            throw new RuntimeException(e);
        }
        assertEquals("[info] hi! this is a sample maven plugin\r\n", outContent.toString());
    }
}