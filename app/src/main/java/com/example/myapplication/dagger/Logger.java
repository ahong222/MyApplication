package com.example.myapplication.dagger;

import javax.inject.Inject;

public class Logger {

    @Inject
    public Logger() {

    }

    public void log(String msg) {
        System.out.println(msg);
    }
}
