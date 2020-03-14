package main;

import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.impl.Arguments;
import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.ArgumentParserException;
import net.sourceforge.argparse4j.inf.Namespace;

public class Main {
    public static void main(String[] args) {
        String version = Main.class.getPackage().getImplementationVersion();
        if (version == null) version = "1.0-DEV";

        ArgumentParser parser = ArgumentParsers.newFor("%{APPNAME}").build()
                .defaultHelp(true)
                .version(version)
                .description("Describe your project");
        parser.addArgument("-v", "--version")
                .action(Arguments.version())
                .help("Show version");

        parser.addArgument("-d", "--debug")
                .action(Arguments.storeTrue())
                .help("Debug information");

        // Argparse4j allows you to parse/validate positional arguments
        parser.addArgument("args")
                .nargs("+")
                .help("Positional arguments");
        parser.addArgument("args2")
                .help("Positional argument2");

        Namespace namespace = null;
        try {
            namespace = parser.parseArgs(args);
        } catch (ArgumentParserException e) {
            parser.handleError(e);
            System.exit(1);
        }

        if (namespace.getBoolean("debug")) {
            System.out.println(namespace.getList("args"));
            System.out.println(namespace.getString("args2"));
        }

    }
}
