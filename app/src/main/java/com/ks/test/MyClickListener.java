package com.ks.test;

import android.app.Activity;
import android.view.View;

import com.ks.test.util.ToastUtil;

/**
 * Created by 窦浩鹏 on 2020/1/20.
 */

public class MyClickListener implements View.OnClickListener {

    private Activity mActivity;
    public MyClickListener(Activity activity){
        this.mActivity = activity;
    }
    @Override
    public void onClick(View v) {

        ToastUtil.showMsg(mActivity,"click...");
    }
}
