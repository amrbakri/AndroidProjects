package com.example.com.resultreceivertest_00;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent serviceIntent = new Intent(this, MyService.class);
        serviceIntent.putExtra("logName", "MAIN_ACTIVITY");
        serviceIntent.putExtra(MyService.BUNDLED_LISTENER, new ResultReceiver(new Handler()) {
            @Override
            protected void onReceiveResult(int resultCode, Bundle resultData) {
                super.onReceiveResult(resultCode, resultData);
            }
        });
        serviceIntent.putExtra(MyService.BUNDLED_LISTENER, new ResultReceiver(new Handler()) {
            @Override
            protected void onReceiveResult(int resultCode, Bundle resultData) {
                super.onReceiveResult(resultCode, resultData);

                if (resultCode == Activity.RESULT_OK) {
                    String val = resultData.getString("value");
                    Log.i(TAG, SubTag.bullet("onReceiveResult", "++++++++++++RESULT_OK+++++++++++ [" + val + "]"));
                } else {
                    Log.i(TAG, SubTag.bullet("onReceiveResult", "+++++++++++++RESULT_NOT_OK++++++++++++"));
                }
            }
        });
        startService(serviceIntent);
    }
}