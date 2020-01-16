package com.ks.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.ks.test.util.ToastUtil;

public class popupWIndowActivity extends AppCompatActivity {

    private Button mBntPop;
    private PopupWindow mPop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_window);
        mBntPop = (Button) findViewById(R.id.btn_pop);
        mBntPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                View view = getLayoutInflater().inflate(R.layout.layout_pop,null);

                TextView textView = view.findViewById(R.id.tv_good);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mPop.dismiss();
                        ToastUtil.showMsg(popupWIndowActivity.this,"好");
                    }
                });
                mPop = new PopupWindow(view,mBntPop.getWidth(), ViewGroup.LayoutParams.WRAP_CONTENT);
                mPop.showAsDropDown(mBntPop);
                mPop.setFocusable(true);
                mPop.setOutsideTouchable(true);

            }
        });
    }
}
