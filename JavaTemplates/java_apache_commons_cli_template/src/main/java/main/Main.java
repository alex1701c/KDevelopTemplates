package main;

import org.apache.commons.cli.*;

import static main.Utils.checkHelpRequested;
import static main.Utils.checkVersionRequested;

public class Main {

    public static void main(String[] args) {
        Options options = new Options();

        Option argOption = Option.builder("a")
                .longOpt("arg")
                .argName("arg")
                .hasArg(true)
                .required()
                .desc("Argument for program")
                .build();
        options.addOption(argOption);

        // option, long option, hasArg, description
        options.addOption(new Option("d", "debug", false, "Debug output"));
        options.addOption(new Option("h", "help", false, "Show Help"));
        options.addOption(new Option("v", "version", false, "Show Version"));

        // Handle help and version requests
        if (checkHelpRequested(args)) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("%{APPNAMELC} <positional parameters>", options, true);
            return;
        }
        if (checkVersionRequested(args)) {
            String version = Main.class.getPackage().getImplementationVersion();
            if (version == null) version = "1.0.0-Dev"; // Value is != null when running executable jar
            System.out.println("%{APPNAMELC}: " + version);
            return;
        }

        CommandLineParser parser = new DefaultParser();
        CommandLine line = null;
        try {
            line = parser.parse(options, args);
        } catch (ParseException exp) {
            System.err.println("Parsing failed.  Reason: " + exp.getMessage());
            return;
        }

        if (line.hasOption("debug")) {
            System.out.println("Value of arg is: " + line.getOptionValue("arg"));
            System.out.println("Positional arguments: " + line.getArgList());
        }

    }

}
