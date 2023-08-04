package com.example.myapplication.items;

/* Author:wujincheng
 * Time:2023/8/5 0:04
 * E-mail: 2370449363@qq.com
 */


import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.util.LogUtil;


public class MyViewHolder extends RecyclerView.ViewHolder {
    private static final String TAG = "MyViewHolder";
    ImageView imageView;
    TextView nameView, emailView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
        nameView = itemView.findViewById(R.id.name);
        emailView = itemView.findViewById(R.id.email);
        LogUtil.D(TAG, "MyViewHolder: init");

    }
}
