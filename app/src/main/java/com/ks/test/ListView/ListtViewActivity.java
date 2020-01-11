package com.ks.test.ListView;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.ks.test.R;

/**
 * Created by AKADhp on 2020/1/11.
 */

public class ListtViewActivity extends Activity {

    private ListView mLv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        mLv1 = findViewById(R.id.iv_1);

        mLv1.setAdapter(new MyListAdapter(ListtViewActivity.this));
        mLv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListtViewActivity.this,"点击pos"+position,Toast.LENGTH_SHORT).show();
            }
        });

        mLv1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(ListtViewActivity.this,"长按"+position,Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}


