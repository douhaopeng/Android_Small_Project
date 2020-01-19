package com.ks.test.Fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.ks.test.R;

/**
 * Created by 窦浩鹏 on 2020/1/18.
 */

public class AFragment extends Fragment {

    private TextView mTvTitle;
    private Activity mActivity;
    private Button mBtnChange,mBtnReset;
    private BFragment bFragment;


    public static AFragment newInstance(String title){
        AFragment fragment = new AFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title",title);
        fragment.setArguments(bundle);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_a,container,false);
        Log.d("AFragment","....onCreateView....");
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {


        super.onViewCreated(view, savedInstanceState);
        mTvTitle = view.findViewById(R.id.tv_title);
        mBtnChange = view.findViewById(R.id.btn_change);
        mBtnReset = view.findViewById(R.id.btn_reset);
        mBtnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(bFragment==null){
                    bFragment = new BFragment();
                }

                getFragmentManager().beginTransaction().replace(R.id.fl_container,bFragment).commitAllowingStateLoss();

            }
        });
        mBtnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mTvTitle.setText("我是新文字");
            }
        });
       if(getArguments()!=null){
           mTvTitle.setText(getArguments().getString("title"));
       }

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


}
