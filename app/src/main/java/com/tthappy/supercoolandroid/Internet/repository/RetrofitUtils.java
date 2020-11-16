package com.tthappy.supercoolandroid.Internet.repository;

import com.tthappy.supercoolandroid.Internet.api.ApiService;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/16 14:06
 * Update Date:
 * Modified By:
 * Description:
 */
public class RetrofitUtils extends BaseRetrofit{

    private static class RetrofitUtilsHolder{
        private static RetrofitUtils sInstance = new RetrofitUtils();
    }

    public static RetrofitUtils getInstance(Object object) {
        return RetrofitUtilsHolder.sInstance;
    }

    private static ApiService apiService;

    public ApiService getApiService(){
        if(null == apiService) apiService = getRetrofit().create(ApiService.class);
        return apiService;
    }

}
