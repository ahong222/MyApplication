package com.example.myapplication.dagger;

import dagger.Lazy;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

public class Street {

    @Inject
    @AAA
    Logger logger;
    @Inject
    @BBB
    Provider<Logger> logger2;

    public Street() {

    }

    public void byCoffee() {
        AppComponent netComponent = AppManager.getAppComponent();
        CoffeeShopComponent coffeeShopComponent = netComponent.getCoffeeShopComponentBuilder().build();
        coffeeShopComponent.inject(this);
        logger.log("inject success，get1:"+logger2.get().hashCode()+" ge2:"+logger2.get().hashCode());
    }

}
