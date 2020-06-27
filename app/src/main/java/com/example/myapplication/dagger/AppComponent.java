package com.example.myapplication.dagger;

import dagger.Component;

import javax.inject.Singleton;

@AppSingleton
@Component(modules = {NetModule.class})
public interface AppComponent {

    CoffeeShopComponent.Builder getCoffeeShopComponentBuilder();

    void inject(AppData appData);

}
