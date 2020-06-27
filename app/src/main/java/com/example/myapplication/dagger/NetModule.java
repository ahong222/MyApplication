package com.example.myapplication.dagger;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

import javax.inject.Inject;

@Module
public class NetModule {

    @Inject
    public NetModule() {

    }

    @Provides
    public Retrofit providerRetrofit() {
        return new Retrofit.Builder().baseUrl("http://a.b.c/api/")
                .build();
    }
}
