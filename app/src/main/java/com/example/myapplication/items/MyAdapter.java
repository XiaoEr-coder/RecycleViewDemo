package com.example.myapplication.items;

/* Author:wujincheng
 * Time:2023/8/5 0:07
 * E-mail: 2370449363@qq.com
 */


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.util.LogUtil;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private static final String TAG = "MyAdapter";
    Context context;
    List<Item> items;

    public MyAdapter(Context context, List<Item> itemlist) {
        this.context = context;
        this.items = itemlist;
        LogUtil.D(TAG, "MyAdapter: ");
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LogUtil.D(TAG, "onCreateViewHolder: ");
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.emailView.setText(items.get(position).getEmail());
        holder.imageView.setImageResource(items.get(position).getImage());
        LogUtil.D(TAG, "onBindViewHolder: ");
    }

    @Override
    public int getItemCount() {
        LogUtil.D(TAG, "getItemCount: ");
        return items.size();
    }


    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
