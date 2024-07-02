package com.example;

public class Dog {

    private final  Logger logger=Logger.getInstance();
    private final LoggerEnum log=LoggerEnum.INSTANCE;

    public void woof() {
        logger.log("DOG SAYS WOOF"+logger);
        log.log("DOG SAYS WOOF"+log.hashCode());
    }



}
