package main;

import com.beust.jcommander.JCommander;

public class Main {

    public static void main(String[] args) {
        Args parsedArgs = new Args();
        JCommander builder = JCommander.newBuilder().addObject(parsedArgs).build();

        builder.setProgramName("%{APPNAME}");
        builder.parse(args);

        if (parsedArgs.isHelp()) {
            builder.usage();
            return;
        } else if (parsedArgs.isVersion()) {
            // Correctly displayed in packaged jar
            System.out.println(builder.getProgramName() + " " + Main.class.getPackage().getImplementationVersion());
            return;
        }

        if (parsedArgs.isDebug()) {
            System.out.println("Debug: " + parsedArgs.isDebug());
            System.out.println("Positional argument: " + parsedArgs.getArgs().toString());
            System.out.println("Option value: " + parsedArgs.getOpt());
        }
    }
}
