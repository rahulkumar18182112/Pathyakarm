package com.example.schoolproject;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @POST("register.php")
    Call<ResponseBody> Register(
            @Field("username") String username,
            @Field("email") String email,
            @Field("password") String password,
            @Field("role") String role

    );

    @FormUrlEncoded
    @POST("login.php")
    Call<ResponseBody> login(
            @Field("email") String email,
            @Field("password") String password

    );



}
