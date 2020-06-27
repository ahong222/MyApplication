package com.example.myapplication.dagger;


import dagger.Subcomponent;

import javax.inject.Singleton;

@Subcomponent(modules = {SubModule.class})
@ActivitySingleton
public interface CoffeeShopComponent {

    @Subcomponent.Builder
    interface Builder {
        CoffeeShopComponent build();
    }

    void inject(Street street);

}
