package com.example.administrator.mvpdemo.service.view;


import com.example.administrator.mvpdemo.service.entity.SplashBean;

/**
 * Created by win764-1 on 2016/12/12.
 */

public interface BookView extends View {
    void onSuccess(SplashBean mBook);
    void onError(String result);
}
