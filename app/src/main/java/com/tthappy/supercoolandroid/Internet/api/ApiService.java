package com.tthappy.supercoolandroid.Internet.api;

import com.tthappy.supercoolandroid.Internet.base.BaseResult;
import com.tthappy.supercoolandroid.entities.UITestEntity;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/9 11:33
 * Update Date:
 * Modified By:
 * Description:
 */
public interface ApiService {

//    @GET("?id=1302425")
//    Call<UITestEntity> getData();

    @GET("?id=1302425")
    Observable<UITestEntity> getData();



}
