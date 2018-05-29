package com.storemanager.farhan.mynewarchitecture;

import android.app.Application;

import com.storemanager.farhan.mynewarchitecture.components.ApiInterfaceComponent;
import com.storemanager.farhan.mynewarchitecture.components.DaggerApiInterfaceComponent;

/**
 * Created by farhan on 20-05-2017.
 */

public class MyApp extends Application {

    private ApiInterfaceComponent apiInterface;

    @Override
    public void onCreate() {
        super.onCreate();

        apiInterface= DaggerApiInterfaceComponent.builder().build();

    }


    public ApiInterfaceComponent getApiInterface() {
        return apiInterface;
    }
}