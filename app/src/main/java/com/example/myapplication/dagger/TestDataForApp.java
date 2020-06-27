package com.example.myapplication.dagger;

import javax.inject.Inject;
import javax.inject.Singleton;

@AppSingleton
public class TestDataForApp {

    @Inject
    public TestDataForApp() {
        System.out.println("TestDataForApp");
    }
}