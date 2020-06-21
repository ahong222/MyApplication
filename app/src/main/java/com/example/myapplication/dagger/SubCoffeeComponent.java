package com.example.myapplication.dagger;

import dagger.Module;
import dagger.Subcomponent;

import javax.inject.Singleton;

@Subcomponent(modules = {SubModule.class})
public interface SubCoffeeComponent {

//    @Subcomponent.Builder
//    interface Builder {
////        Builder setProvider(SubModule subModule);
//        SubCoffeeComponent build();
//    }

    void inject(Street app);


//    SubData getSubData();
}
