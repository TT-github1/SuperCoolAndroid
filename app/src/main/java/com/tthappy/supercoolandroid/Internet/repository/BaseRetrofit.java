package com.tthappy.supercoolandroid.Internet.repository;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/16 14:15
 * Update Date:
 * Modified By:
 * Description:
 */
public class BaseRetrofit {
    private static volatile Retrofit retrofit;

    public static Retrofit getRetrofit(){
        if (null == retrofit){
            synchronized (BaseRetrofit.class){
                if(null == retrofit){
                    retrofit = new Retrofit
                            .Builder()
                            .baseUrl("https://movie.querydata.org/api/")
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                }
            }
        }

        return retrofit;
    }


}
