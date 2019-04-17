package com.example.practiceapplication;

import android.app.Application;

import com.example.practiceapplication.Dagger.AppComponent;
import com.example.practiceapplication.Dagger.DaggerAppComponent;

public class App extends Application {

    private static AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    public static AppComponent getComponent() {
        return component;
    }
}
