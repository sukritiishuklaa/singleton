package com.example;
public enum LoggerEnum {

    INSTANCE;

    public static LoggerEnum getInstance() {

        return INSTANCE;
    }

    void log(String logMessage) {
        System.out.println(logMessage);
    }
}
