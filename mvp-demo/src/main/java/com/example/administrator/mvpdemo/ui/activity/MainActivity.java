package com.example.administrator.mvpdemo.ui.activity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.mvpdemo.R;
import com.example.administrator.mvpdemo.service.entity.SplashBean;
import com.example.administrator.mvpdemo.service.presenter.BookPresenter;
import com.example.administrator.mvpdemo.service.view.BookView;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_PHONE_STATE = 0x00000001;

    private String imei;


    private TextView text;
    private Button button;
    private BookPresenter mBookPresenter = new BookPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBookPresenter.splash(imei);
            }
        });
        mBookPresenter.onCreate();
        mBookPresenter.attachView(mBookView);


        TelephonyManager telephonyMgr = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_PHONE_STATE}, REQUEST_PHONE_STATE);
            return;
        }
        assert telephonyMgr != null;
        imei = telephonyMgr.getDeviceId();
    }

    private BookView mBookView = new BookView() {
        @Override
        public void onSuccess(SplashBean mBook) {
            text.setText("请求成功：\n" + mBook.toString() + "\n" + mBook.getTimeStr());
        }

        @Override
        public void onError(String result) {
            Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mBookPresenter.onStop();
    }


    /**
     * 加个获取权限的监听
     */
    @SuppressLint("HardwareIds")
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQUEST_PHONE_STATE && grantResults.length == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            TelephonyManager TelephonyMgr = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);
            assert TelephonyMgr != null;
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_PHONE_STATE}, REQUEST_PHONE_STATE);
                return;
            }
            imei = TelephonyMgr.getDeviceId();
        }
    }
}
