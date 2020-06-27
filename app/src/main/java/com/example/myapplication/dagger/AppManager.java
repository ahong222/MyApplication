package com.example.myapplication.dagger;

public class AppManager {

    static AppComponent netComponent;

    public static AppComponent getAppComponent() {
        if (netComponent == null) {
            netComponent = DaggerAppComponent.create();
        }

        return netComponent;
    }

}
