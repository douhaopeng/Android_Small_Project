package com.ks.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class imageViewActivity extends AppCompatActivity {

    private ImageView mIv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        mIv4 = (ImageView) findViewById(R.id.iv_4);
        Glide.with(this).load("https://bkimg.cdn.bcebos.com/pic/7dd98d1001e939017dc1af9a72ec54e737d19656@wm_1,g_7,k_d2F0ZXIvYmFpa2U4MA==,xp_5,yp_5").into(mIv4);

    }
}
