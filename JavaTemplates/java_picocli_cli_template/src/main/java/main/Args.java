package main;

import lombok.Data;
import picocli.CommandLine.*;

@Data
@Command(description = "Description of this command", versionProvider = Args.MavenVersionProvider.class)
public class Args {

    @Parameters(description = "person to greet", defaultValue = "World")
    private String name;


    @Option(names = {"-d", "--debug"}, negatable = true, description = "debug given information")
    private boolean debug = false;

    @Option(names = {"-h", "--help"}, usageHelp = true, description = "display a help message")
    private boolean helpRequested = false;

    @Option(names = {"-v", "--version"}, versionHelp = true, description = "display a version message")
    private boolean versionRequested = false;

    static class MavenVersionProvider implements IVersionProvider {

        @Override
        public String[] getVersion() {
            String version = getClass().getPackage().getImplementationVersion();
            if (version == null) version = "DEV";
            return new String[]{"%{APPNAME}" + ": " + version};
        }
    }
}
