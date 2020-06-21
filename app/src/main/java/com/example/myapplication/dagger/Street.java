package com.example.myapplication.dagger;

import javax.inject.Inject;

/**
 * 包含咖啡店的街道
 */
public class Street {

    @Inject
    CoffeeMaker coffeeMaker;

    @Inject
    CoffeeMaker coffeeMaker2;

    @Inject
    Logger logger1;
    @Inject
    Logger logger2;

    @Inject
    SubData subData1;
    @Inject
    SubData subData2;

    CoffeeShopComponent coffeeShopComponent = null;
    SubCoffeeComponent subCoffeeComponent = null;
    public Street() {

    }

    public void byCoffee() {
        coffeeShopComponent = DaggerCoffeeShopComponent.builder().subModule(new SubModule()).build();
        subCoffeeComponent = coffeeShopComponent.page().build();
//        subCoffeeComponent = coffeeShopComponent.getSubCoffeeComponent(new SubModule());
        subCoffeeComponent.inject(this);
        coffeeMaker.makeCoffee();


        coffeeMaker.logger.log(coffeeMaker.hashCode() + "_" + coffeeMaker2.hashCode());
        coffeeMaker.logger.log(logger1.hashCode() + "_" + logger2.hashCode());
        coffeeMaker.logger.log(subData1.hashCode() + "_" + subData2.hashCode());
    }
}
