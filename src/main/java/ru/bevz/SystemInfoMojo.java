package ru.bevz;

import org.apache.commons.lang3.SystemUtils;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "systeminfo")
public class SystemInfoMojo extends AbstractMojo {

	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info("JAVA HOME: " + SystemUtils.JAVA_HOME);
		getLog().info("JAVA VERSION: " + SystemUtils.JAVA_VERSION);
		getLog().info( "OS NAME: " + SystemUtils.OS_NAME);
		getLog().info("OS VERSION: " + SystemUtils.OS_VERSION);
		getLog().info("USER_NAME: " + SystemUtils.USER_NAME);
	}
}
