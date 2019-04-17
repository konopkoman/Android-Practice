package com.example.practiceapplication.Dagger;

import com.example.practiceapplication.MainActivity;

import dagger.Component;

@Component(modules = {StorageModule.class, NetworkModule.class})
public interface AppComponent {

    void injectsMainActivity(MainActivity mainActivity);

}
