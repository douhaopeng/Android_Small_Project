package com.ks.test.Fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ks.test.R;

public class ContainActivity extends AppCompatActivity {

    private AFragment aFragment;
    private BFragment bFragment;

    private Button mBtnChange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contain);
        mBtnChange = (Button) findViewById(R.id.btn_change);
        mBtnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bFragment==null){
                    bFragment = new BFragment();
                }

                getFragmentManager().beginTransaction().replace(R.id.fl_container,bFragment).commitAllowingStateLoss();
            }
        });
        aFragment =  AFragment.newInstance("我是参数");
        getFragmentManager().beginTransaction().add(R.id.fl_container, aFragment).commitAllowingStateLoss();
    }


}
