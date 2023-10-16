package com.example.schoolproject;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofitclient {

    private static final String BASE_URL="http://192.168.95.1:8080/userApi2/";
    private static Retrofitclient retrofitclient;
    private static Retrofit retrofit;


    private Retrofitclient(){


        retrofit=new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized Retrofitclient getInstance(){
        if(retrofitclient==null){
            retrofitclient=new Retrofitclient();
        }
        return retrofitclient;
    }


    public Api getApi(){
        return retrofit.create(Api.class);
    }


}
