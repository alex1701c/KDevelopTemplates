package main;

import com.beust.jcommander.Parameter;
import lombok.Data;

import java.util.List;

@Data
class Args {
    @Parameter(description = "<arguments>", required = true)
    private List<String> args;

    @Parameter(names = {"-o", "--option"})
    private String opt = "";

    @Parameter(names = {"-d", "--debug"}, description = "Debug mode")
    private boolean debug = false;

    @Parameter(names = {"-h", "--help"}, description = "Display help information", help = true)
    private boolean help;

    @Parameter(names = {"-v", "--version"}, description = "Display version number", help = true)
    private boolean version;
}
