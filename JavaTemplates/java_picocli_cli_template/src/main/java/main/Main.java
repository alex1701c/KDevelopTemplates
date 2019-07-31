package main;

import picocli.CommandLine;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Args parsedArgs = new Args();
        CommandLine commandLine = new CommandLine(parsedArgs);
        commandLine.setCommandName("%{APPNAMELC}");
        commandLine.parseArgs(args);


        if (commandLine.isUsageHelpRequested()) {
            commandLine.usage(System.out);
            return;
        } else if (commandLine.isVersionHelpRequested()) {
            commandLine.printVersionHelp(System.out);
            return;
        }

        if (parsedArgs.isDebug()) {
            System.out.println("Command line arguments: " + Arrays.toString(args));
            System.out.println("Name: " + parsedArgs.getName());
        }

        System.out.println("Hello " + parsedArgs.getName() + " !");


    }
}
