package com.example;

public class Cat {

    private final LoggerEnum log = LoggerEnum.INSTANCE;
    private final Logger logger = Logger.getInstance();

    public void meow() {

        // LoggerEnum log = LoggerEnum.INSTANCE;
        logger.log("CAT SAYS MEOW" + logger);
        log.log("CAT SAYS MEOW" + log.hashCode());
    }

}
