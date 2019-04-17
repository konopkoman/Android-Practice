package com.example.practiceapplication.Dagger;

import com.example.practiceapplication.DatabaseHelper;

import dagger.Module;
import dagger.Provides;

@Module
public class StorageModule {

    @Provides
    DatabaseHelper provideDatabaseHelper() {
        return new DatabaseHelper();
    }

}
