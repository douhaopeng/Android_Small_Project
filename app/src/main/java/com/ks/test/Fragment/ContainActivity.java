package com.ks.test.Fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ks.test.R;

public class ContainActivity extends AppCompatActivity implements AFragment.IOnMessegeClick{

    private AFragment aFragment;
    private TextView mTvTitle;
//    private BFragment bFragment;
//
//    private Button mBtnChange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contain);
        mTvTitle = (TextView) findViewById(R.id.tv_title);
//        mBtnChange = (Button) findViewById(R.id.btn_change);
//        mBtnChange.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(bFragment==null){
//                    bFragment = new BFragment();
//                }
//
//                getFragmentManager().beginTransaction().replace(R.id.fl_container,bFragment).commitAllowingStateLoss();
//            }
//        });
        aFragment =  AFragment.newInstance("我是参数");
        getFragmentManager().beginTransaction().add(R.id.fl_container, aFragment,"a").commitAllowingStateLoss();
    }

public void setData(String text){

    mTvTitle.setText(text);

}

    @Override
    public void onCLick(String text) {
        mTvTitle.setText(text);
    }
}
