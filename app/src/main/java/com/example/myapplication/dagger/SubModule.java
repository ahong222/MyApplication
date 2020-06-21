package com.example.myapplication.dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class SubModule {


    @Provides
    public SubData provideSubData() {
        return new SubData("666666");
    }

}
