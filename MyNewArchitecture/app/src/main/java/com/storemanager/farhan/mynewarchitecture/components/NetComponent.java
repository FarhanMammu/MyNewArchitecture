package com.storemanager.farhan.mynewarchitecture.components;

import com.storemanager.farhan.mynewarchitecture.modules.NetModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules= {NetModule.class})
public interface NetComponent {

}
