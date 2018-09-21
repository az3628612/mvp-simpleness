package com.example.administrator.mvpdemo.service.manager;

import android.content.Context;


import com.example.administrator.mvpdemo.service.RetrofitService;
import com.example.administrator.mvpdemo.service.RetrofitHelper;
import com.example.administrator.mvpdemo.service.entity.SplashBean;

import rx.Observable;

/**
 * Created by win764-1 on 2016/12/12.
 */

public class DataManager {
    private RetrofitService mRetrofitService;
    public DataManager(Context context){
        this.mRetrofitService = RetrofitHelper.getInstance(context).getServer();
    }
    public  Observable<SplashBean> splash(String imei){
        return mRetrofitService.splash(imei,"android");
    }
}
