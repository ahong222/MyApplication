package com.example.myapplication.dagger;

import javax.inject.Inject;
import javax.inject.Singleton;

public class CoffeeMaker {

    Logger logger;
    @Inject
    public CoffeeMaker(Logger logger) {
        this.logger = logger;
    }

    public void makeCoffee() {
        logger.log("start makeCoffee");
        logger.log("start heat");
        logger.log("makeCoffee success");
    }
}
