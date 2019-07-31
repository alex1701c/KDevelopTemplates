import main.Args;
import org.junit.jupiter.api.Test;
import picocli.CommandLine;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ExampleTest {

    @Test
    void checkHelpRequest() {
        String[] args = {"--help"};
        Args parsedArgs = new Args();
        CommandLine commandLine = new CommandLine(parsedArgs);
        commandLine.parseArgs(args);

        assertTrue(commandLine.isUsageHelpRequested());
    }
}
