package com.example.practiceapplication.Dagger;

import com.example.practiceapplication.NetworkUtils;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {

    @Provides
    NetworkUtils provideNetworkUtils() {
        return new NetworkUtils();
    }
}
