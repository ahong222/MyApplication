package com.example.myapplication.dagger;

import javax.inject.Inject;
import javax.inject.Named;

@ActivitySingleton
public class TestData {

    @Inject
    public TestData() {
        System.out.println("abc");
    }

}
