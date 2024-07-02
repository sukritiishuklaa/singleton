package com.example;

public final class Logger {

    public static Logger LOGGER;

    private Logger() {
    }

    public static Logger getInstance() {
        if (LOGGER == null)
            LOGGER = new Logger();

        return LOGGER;
    }

    void log(String logMessage) {
        System.out.println(logMessage);
    }

}
