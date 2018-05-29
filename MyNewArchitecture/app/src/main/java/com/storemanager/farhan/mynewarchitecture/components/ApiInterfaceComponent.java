package com.storemanager.farhan.mynewarchitecture.components;

import com.storemanager.farhan.mynewarchitecture.modules.MyArchApiInterface;
import com.storemanager.farhan.mynewarchitecture.modules.NetModule;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules={NetModule.class, MyArchApiInterface.class})
public interface ApiInterfaceComponent {
   // void inject(Interactor baseInteractor);

}
