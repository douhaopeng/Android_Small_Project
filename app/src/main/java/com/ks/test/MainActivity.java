package com.ks.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnUI;
    private Button mBtnSJ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnUI = (Button) findViewById(R.id.btn_ui);
        OnClick onClick = new OnClick();
        mBtnUI.setOnClickListener(onClick);
        mBtnSJ = (Button) findViewById(R.id.btn_shijian);
        mBtnSJ.setOnClickListener(onClick);
    }

    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent= null;
            switch (v.getId()){
                case R.id.btn_ui:
                    intent = new Intent(MainActivity.this,UIActivity.class);
                    break;
                case R.id.btn_shijian:
                    intent = new Intent(MainActivity.this,EventActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
