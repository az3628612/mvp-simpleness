package com.example.administrator.mvpdemo.service;



import com.example.administrator.mvpdemo.service.entity.SplashBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by win764-1 on 2016/12/12.
 */

public interface RetrofitService {
    @GET("api/v2/init")
    Observable<SplashBean> splash(@Query("imei") String imei,
                                          @Query("os") String os);
}
