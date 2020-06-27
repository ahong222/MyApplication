package com.example.myapplication.dagger;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

import javax.inject.Named;

@Module
public class SubModule {

    @AAA
    @ActivitySingleton
    @Provides
    public Logger providerLogger(Retrofit retrofit) {
        System.out.println("aaaa");
        return new Logger(retrofit);
    }

    @BBB
    @ActivitySingleton
    @Provides
    public Logger providerLoggerB(Retrofit retrofit) {
        System.out.println("bbbb");
        return new Logger(retrofit);
    }

}
