package com.example.myapplication.dagger;

import javax.inject.Inject;

public class AppData {
    @Inject
    public TestDataForApp testDataForApp;
    @Inject
    public TestDataForApp testDataForApp2;

    public AppData() {
        AppComponent netComponent = AppManager.getAppComponent();
        netComponent.inject(this);

        System.out.println("testDataForApp:"+testDataForApp.hashCode()+" testDataForApp2:"+testDataForApp2.hashCode());
    }
}
