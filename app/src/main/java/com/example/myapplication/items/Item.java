package com.example.myapplication.items;

/* Author:wujincheng
 * Time:2023/8/4 23:52
 * E-mail: 2370449363@qq.com
 */


import android.util.Log;

import androidx.annotation.NonNull;

import com.example.myapplication.util.LogUtil;

public class Item {
    String name;
    String email;
    int image;
    private static final String TAG = "Item";
    public Item(String name, String email, int image) {
        this.name = name;
        this.email = email;
        this.image = image;
        LogUtil.D(TAG, "Item: " + this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }



    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
