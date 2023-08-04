package com.example.myapplication.util;

/* Author:wujincheng
 * Time:2023/8/5 0:32
 * E-mail: 2370449363@qq.com
 */


import android.util.Log;


public class LogUtil {
    private final static String TAG = "recycle_demo";
    private static Object lock;
    private static mmkv kv;
    private static final String ftag = TAG+"-";

    private LogUtil() {
        lock = new Object();
        kv = new mmkv();
    }


    public static void D(String tag, String log) {
        if (lock != null) {
            Log.e( ftag, log);
        }
        if(kv !=null){
            mmkv.setDate(ftag,log);
        }


    }

    public static void E(String tag, String log) {
        if (lock != null) {
            Log.e(ftag, log);
        }
        if(kv !=null){
            mmkv.setDate(ftag,log);
        }
    }


}
