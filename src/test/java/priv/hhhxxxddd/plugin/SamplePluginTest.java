package priv.hhhxxxddd.plugin;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.junit.jupiter.api.Test;

import javax.annotation.security.RunAs;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * ▣ 测试
 *
 * @author hhhxxxddd
 * @since 2022-11-12 02:44
 */
class SamplePluginTest {
    private final SamplePlugin samplePlugin = new SamplePlugin();

    /**
     * 测试日志输出
     */
    @Test
    void testExecute() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setErr(new PrintStream(outContent));
        try {
            samplePlugin.execute();
        } catch (MojoExecutionException | MojoFailureException e) {
            throw new RuntimeException(e);
        }
        assertEquals("[main] INFO SamplePlugin - hi! this is a sample maven plugin\r\n",
                outContent.toString(StandardCharsets.UTF_8));
    }
}