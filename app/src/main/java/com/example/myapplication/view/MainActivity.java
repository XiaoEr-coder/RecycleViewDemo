package com.example.myapplication.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.DialogTitle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.hardware.lights.LightsManager;
import android.os.Bundle;
import android.telephony.ims.ImsMmTelManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.items.Item;
import com.example.myapplication.items.MyAdapter;
import com.example.myapplication.util.LogUtil;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import kotlin.annotation.AnnotationTarget;

/**
 * @author XiaoEr
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtil.D(TAG,"onCreate");

        List<Item> itemList = new ArrayList<Item>();
        itemList.add(new Item("张三","1234556@email.cm",R.drawable.a));
        itemList.add(new Item("李四","4194535@email.cm",R.drawable.b));
        itemList.add(new Item("王五","4656544@email.cm",R.drawable.c));
        itemList.add(new Item("吴六","2626922@email.cm",R.drawable.d));
        itemList.add(new Item("路奇","12363256@email.cm",R.drawable.e));
        itemList.add(new Item("齐彂","525623ad@email.cm",R.drawable.f));
        LogUtil.D(TAG,"add item list complete!");

        //init RecycleView
        RecyclerView recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext() , itemList));
        LogUtil.D(TAG,"init RecycleView complete");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogUtil.D(TAG, "onRestart: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogUtil.D(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtil.D(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogUtil.D(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        LogUtil.D(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtil.D(TAG, "onDestroy: ");
    }
}