package priv.hhhxxxddd.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * ▣maven插件类实现
 *
 * @author hhhxxxddd
 * @apiNote <p>{@link #execute()} 插件执行</p>
 * @since 2022-11-12 01:54
 */
@Mojo(name = "say-hi")
public class SamplePlugin extends AbstractMojo {
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("hi! this is a sample maven plugin");
    }
}
