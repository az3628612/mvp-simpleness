package com.example.administrator.mvpdemo.service.presenter;

import android.content.Context;
import android.content.Intent;


import com.example.administrator.mvpdemo.service.entity.SplashBean;
import com.example.administrator.mvpdemo.service.manager.DataManager;
import com.example.administrator.mvpdemo.service.view.BookView;
import com.example.administrator.mvpdemo.service.view.View;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by win764-1 on 2016/12/12.
 */

public class BookPresenter implements Presenter {
    private DataManager manager;
    private CompositeSubscription mCompositeSubscription;
    private Context mContext;
    private BookView mBookView;
    private SplashBean splashBean;

    public BookPresenter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void onCreate() {
        manager = new DataManager(mContext);
        mCompositeSubscription = new CompositeSubscription();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {
        if (mCompositeSubscription.hasSubscriptions()) {
            mCompositeSubscription.unsubscribe();
        }
    }

    @Override
    public void pause() {

    }

    @Override
    public void attachView(View view) {
        mBookView = (BookView) view;
    }

    @Override
    public void attachIncomingIntent(Intent intetn) {
    }

    public void splash(String imei) {
        final long startTime = System.currentTimeMillis();
        mCompositeSubscription.add(manager.splash(imei)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<SplashBean>() {
                    @Override
                    public void onCompleted() {
                        if (splashBean != null) {
                            mBookView.onSuccess(splashBean);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        mBookView.onError("请求失败！！");
                    }

                    @Override
                    public void onNext(SplashBean bean) {
                        long endTime = System.currentTimeMillis();
                        System.out.println("初始化用时：" + (endTime - startTime) / 1000);
                        splashBean = bean;
                        splashBean.setTimeStr("初始化用时：" + (endTime - startTime) / 1000 + "." + (endTime - startTime) % 1000);
                    }
                })
        );
    }
}
