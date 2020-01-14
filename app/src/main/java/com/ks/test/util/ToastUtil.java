package com.ks.test.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by 窦浩鹏 on 2020/1/14.
 */

public class ToastUtil {

    public static Toast mToast;
    public static void showMsg(Context context,String msg){
        if(mToast==null){

            mToast = Toast.makeText(context,msg,Toast.LENGTH_LONG);
        }else{


            mToast.setText(msg);
        }
        mToast.show();

    }
}
