package com.ks.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ks.test.util.ToastUtil;

public class ToastActivity extends AppCompatActivity {

    private Button mBtnToast1,mBtnToast2,mBtnToast3,mBtnToast4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        mBtnToast1 = (Button) findViewById(R.id.btn_toast_1);
        mBtnToast2 = (Button) findViewById(R.id.btn_toast_2);
        mBtnToast3 = (Button) findViewById(R.id.btn_toast_3);
        mBtnToast4 = (Button) findViewById(R.id.btn_toast_4);
        ToastActivity.OnClick onClick= new ToastActivity.OnClick();


        mBtnToast1.setOnClickListener(onClick);
        mBtnToast2.setOnClickListener(onClick);
        mBtnToast3.setOnClickListener(onClick);
        mBtnToast4.setOnClickListener(onClick);


    }

    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {

            switch (v.getId()){
                case R.id.btn_toast_1:
                    Toast.makeText(ToastActivity.this,"toast_1",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn_toast_2:
                  Toast toastCenter =   Toast.makeText(ToastActivity.this,"居中Toast",Toast.LENGTH_SHORT);
                    toastCenter.setGravity(Gravity.CENTER,0,0);
                    toastCenter.show();

                    break;
                case R.id.btn_toast_3:
                    Toast.makeText(getApplicationContext(),"toast_3",Toast.LENGTH_SHORT).show();
                    LayoutInflater inflater = LayoutInflater.from(ToastActivity.this);
                    View view = inflater.inflate(R.layout.layout_toast,null);
                    ImageView imageView = view.findViewById(R.id.iv_toast);
                    TextView textView = view.findViewById(R.id.tv_toast);
                    imageView.setImageResource(R.drawable.smile);
                    Toast toastCustom= new Toast(getApplicationContext());
                    toastCustom.setView(view);
                    textView.setText("自定义Toast");

                    toastCustom.setDuration(Toast.LENGTH_LONG);
                    toastCustom.show();
                    break;

                case R.id.btn_toast_4:
                    ToastUtil.showMsg(getApplicationContext(),"包装过得Toast");
                    break;
            }
        }
    }


}
