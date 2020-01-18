package com.ks.test.Fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ks.test.R;

public class ContainActivity extends AppCompatActivity {

    private AFragment aFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contain);
        aFragment = new AFragment();
        getFragmentManager().beginTransaction().add(R.id.fl_container, aFragment).commitAllowingStateLoss();
    }
}
