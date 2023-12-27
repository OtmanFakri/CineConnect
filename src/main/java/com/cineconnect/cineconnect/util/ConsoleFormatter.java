package com.cineconnect.cineconnect.util;

public class ConsoleFormatter {

    // ANSI escape codes for color and formatting
    public static final String RESET = "\033[0m";
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";  // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m";  // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";  // YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE

    /**
     * Print a success message to the console.
     *
     * @param message the message to display.
     */
    public static void printSuccess(String message) {
        System.out.println(GREEN_BOLD_BRIGHT + "[SUCCESS] " + message + RESET);
    }

    /**
     * Print an error message to the console.
     *
     * @param message the message to display.
     */
    public static void printError(String message) {
        System.out.println(RED_BOLD_BRIGHT + "[ERROR] " + message + RESET);
    }

    /**
     * Print a warning message to the console.
     *
     * @param message the message to display.
     */
    public static void printWarning(String message) {
        System.out.println(YELLOW_BOLD_BRIGHT + "[WARNING] " + message + RESET);
    }

    /**
     * Print an info message to the console.
     *
     * @param message the message to display.
     */
    public static void printInfo(String message) {
        System.out.println(BLUE_BOLD_BRIGHT + "[INFO] " + message + RESET);
    }

    // You can add more methods as needed for specific use-cases or formats.
}

