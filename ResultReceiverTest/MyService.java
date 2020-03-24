package com.example.com.resultreceivertest_00;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by amrbak on 21.07.2016.
 */
public class MyService extends Service {

    private final static String TAG = MyService.class.getSimpleName();
    public final static String BUNDLED_LISTENER = "listener";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.w(TAG, SubTag.bullet("onCreate"));
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.w(TAG, SubTag.bullet("onStartCommand"));

        String logName = intent.getStringExtra("logName");
        ResultReceiver receiver = intent.getParcelableExtra(MyService.BUNDLED_LISTENER);

        Bundle bundle = new Bundle();
        bundle.putString("value", "30");
        receiver.send(Activity.RESULT_OK, bundle);
        return Service.START_NOT_STICKY;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.w(TAG, SubTag.bullet("onBind"));

        return null;
    }

}
