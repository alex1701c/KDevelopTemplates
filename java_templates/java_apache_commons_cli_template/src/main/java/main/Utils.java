package main;

import java.util.Arrays;

class Utils {

    static boolean checkHelpRequested(String[] args) {
        return Arrays.asList(args).contains("-h") || Arrays.asList(args).contains("--help");
    }

    static boolean checkVersionRequested(String[] args) {
        return Arrays.asList(args).contains("-v") || Arrays.asList(args).contains("--version");
    }
}
