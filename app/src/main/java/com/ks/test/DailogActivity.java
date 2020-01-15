package com.ks.test;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ks.test.util.ToastUtil;

public class DailogActivity extends AppCompatActivity {

    private Button mBtnDialog1,mBtnDialog2,mBtnDialog3,mBtnDialog4,mBtnDialog5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dailog);

        mBtnDialog1 = (Button) findViewById(R.id.btn_dialog1);
        mBtnDialog2 = (Button) findViewById(R.id.btn_dialog2);
        mBtnDialog3 = (Button) findViewById(R.id.btn_dialog3);
        mBtnDialog4 = (Button) findViewById(R.id.btn_dialog4);
        mBtnDialog5 = (Button) findViewById(R.id.btn_dialog5);
        OnClick onClick = new OnClick();
        mBtnDialog1.setOnClickListener(onClick);
        mBtnDialog2.setOnClickListener(onClick);
        mBtnDialog3.setOnClickListener(onClick);
        mBtnDialog4.setOnClickListener(onClick);
        mBtnDialog5.setOnClickListener(onClick);


    }

    class  OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {

            switch (v.getId()){

                case R.id.btn_dialog1:
                    AlertDialog.Builder builder = new AlertDialog.Builder(DailogActivity.this);
                    builder.setTitle("请回答").setMessage("你觉得课程如何").setIcon(R.drawable.username)
                            .setPositiveButton("帮", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                    ToastUtil.showMsg(DailogActivity.this,"你很诚实");
                                }
                            }).setNegativeButton("还行", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DailogActivity.this,"你再瞅瞅");

                        }
                    }).setNegativeButton("不好", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            ToastUtil.showMsg(DailogActivity.this,"睁眼说瞎话");

                        }
                    }).show();
                    break;
                case R.id.btn_dialog2:
                    final String[] array = new String[]{"男","女"};
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(DailogActivity.this);
                    builder1.setTitle("选择性别").setItems(array, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DailogActivity.this,array[which]);
                        }
                    }).show();
                    break;
                case R.id.btn_dialog3:
                    final String[] array2 = new String[]{"男","女"};
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(DailogActivity.this);
                    builder2.setTitle("选择性别").setSingleChoiceItems(array2, 0, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DailogActivity.this,array2[which]);

                            dialog.dismiss();
                        }
                    }).setCancelable(false).show();
                    break;
                case R.id.btn_dialog4:
                    final String[] array3 = new String[]{"唱歌","跳舞","写代码"};
                    boolean[] isSelected = new boolean[]{false,false,true};
                    AlertDialog.Builder builder3 = new AlertDialog.Builder(DailogActivity.this);
                    builder3.setTitle("选择兴趣").setMultiChoiceItems(array3, isSelected, new DialogInterface.OnMultiChoiceClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                            ToastUtil.showMsg(DailogActivity.this,array3[which]+":"+isChecked);

                        }
                    }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    break;
                case R.id.btn_dialog5:
                    AlertDialog.Builder builder4 = new AlertDialog.Builder(DailogActivity.this);
                  View view =   LayoutInflater.from(DailogActivity.this).inflate(R.layout.layout_dialog,null);
                    EditText etUsername = view.findViewById(R.id.et_username);
                    EditText etPassword = view.findViewById(R.id.et_password);
                    Button btnLogin = view.findViewById(R.id.btn_login);
                    builder4.setTitle("请先登录").setView(view).show();

                    btnLogin.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                        }
                    });
                    break;

            }
        }
    }
}
