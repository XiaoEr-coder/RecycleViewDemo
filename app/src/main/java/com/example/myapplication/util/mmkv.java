package com.example.myapplication.util;

/* Author:wujincheng
 * Time:2023/8/5 0:57
 * E-mail: 2370449363@qq.com
 */


import com.tencent.mmkv.MMKV;

/**
 * @author XiaoEr
 */
public class mmkv {
    private static final String TAG = "mmkv";

   private static MMKV kv ;

   public mmkv(){
       kv  = MMKV.defaultMMKV();
   }

    public static void  setDate(String map,String val){
        if(kv == null){
            LogUtil.D(TAG,"kv is null");
            return;
        }
        //存储
        kv.encode(map,val);
    }

    public static String  getDate(String map,String val){
        if(kv == null){
            LogUtil.D(TAG,"kv is null");
            return "kv is null";
        }
        //读取
       return kv.decodeString(map,val);
    }
}
