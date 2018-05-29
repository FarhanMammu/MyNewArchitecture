package com.storemanager.farhan.mynewarchitecture.modules;


import com.storemanager.farhan.mynewarchitecture.ApiInterface;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;


@Module
public class MyArchApiInterface {
    @Provides
    @Singleton
    public ApiInterface providesGitHubInterface(Retrofit retrofit) {
        return retrofit.create(ApiInterface.class);
    }
}
