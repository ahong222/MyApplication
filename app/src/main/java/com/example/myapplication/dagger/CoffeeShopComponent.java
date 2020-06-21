package com.example.myapplication.dagger;


import dagger.Component;
import dagger.Subcomponent;

import javax.inject.Singleton;

@Component(modules = {SubModule.class})
public interface CoffeeShopComponent {


//    CoffeeMaker coffeeMaker();
//
//    Logger logger();

    void inject(Street app);

    SubCoffeeComponent.Builder page();

}
