package com.ks.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import com.ks.test.util.ToastUtil;
import com.ks.test.widget.MyButton;

public class EventActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mBtnEvent;
    private Button mBtnHandler;

    private MyButton btnMy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        mBtnEvent = (Button) findViewById(R.id.btn_event);
        //内部类实现
        mBtnEvent.setOnClickListener(new Onclck());
        mBtnHandler = (Button) findViewById(R.id.btn_handler);
        btnMy = (MyButton) findViewById(R.id.btn_my);
        btnMy.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){

                    case MotionEvent.ACTION_DOWN:
                        Log.d("Listrner","onTounch......");
                        break;

                }
                return false;
            }
        });

        mBtnHandler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(EventActivity.this,HandlerActivity.class);
                startActivity(intent);
            }
        });
        btnMy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("listener","..OnClick....");
            }
        });
        //匿名内部类实现
//        mBtnEvent.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ToastUtil.showMsg(EventActivity.this,"click,,,");
//            }
//        });
//通过事件源所在的类实现
//        mBtnEvent.setOnClickListener(EventActivity.this);
//通过外部类
//        mBtnEvent.setOnClickListener(new MyClickListener(EventActivity.this));

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_event:
                ToastUtil.showMsg(EventActivity.this,"click...");
                break;
        }
    }

    class Onclck implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_event:
                    ToastUtil.showMsg(EventActivity.this,"click,,,");
                    break;
            }
        }
    }

//    public void show(View v){
//        switch (v.getId()){
//
//            case R.id.btn_event:
//                ToastUtil.showMsg(EventActivity.this,"click,,,");
//                break;
//        }
//
//    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("Activity","...OnTounchEvent....");
                break;
        }
        return false;
    }
}
