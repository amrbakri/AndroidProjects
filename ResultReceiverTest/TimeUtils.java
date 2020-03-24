package com.example.com.resultreceivertest_00;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Amr on 11/26/2015.
 */
public class TimeUtils {

    private final static String TAG = TimeUtils.class.getClass().getSimpleName();

    public static long getTSMilli() {
        Log.w(TAG, SubTag.bullet("getTSMilli"));

        return System.nanoTime()/1000000;
    }

    public static long getTSSec() {
        //Log.w(TAG, SubTag.bullet("getTSSec"));

        return System.nanoTime()/1000000000;
    }

    public static String getNowTS() {
        SimpleDateFormat s = new SimpleDateFormat("hhmmss");
        return s.format(new Date());
    }
}
