package com.storemanager.farhan.mynewarchitecture.modules;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.storemanager.farhan.mynewarchitecture.ApiInterface;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


@Module
public class NetModule {
    @Provides
    @Singleton
    HttpLoggingInterceptor provideHttpLoggingInterceptor(){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return interceptor;
    }

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient(HttpLoggingInterceptor interceptor)
    {
       return new OkHttpClient.Builder().connectTimeout(4, TimeUnit.MINUTES).addInterceptor(interceptor).build();
    }
    @Provides
    @Singleton
    Gson providesGson(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        return gsonBuilder.create();
    }
    @Provides
    @Singleton
    Retrofit providesRetrofit(Gson gson, OkHttpClient okHttpClient){
        Retrofit retrofit = new Retrofit.Builder()
              //  .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(ApiInterface.url)
                .client(okHttpClient)
                .build();
        return retrofit;
    }


}
