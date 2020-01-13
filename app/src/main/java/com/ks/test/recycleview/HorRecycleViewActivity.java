package com.ks.test.recycleview;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.ks.test.R;

public class HorRecycleViewActivity extends AppCompatActivity {


    private RecyclerView mRvHor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hor_recycle_view);
        mRvHor = (RecyclerView) findViewById(R.id.rv_hor);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(HorRecycleViewActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRvHor.setLayoutManager(linearLayoutManager);
        mRvHor.addItemDecoration(new MyDecoration());

        mRvHor.setAdapter(new HorAdapter(HorRecycleViewActivity.this, new HorAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {

                Toast.makeText(HorRecycleViewActivity.this,"click+"+pos,Toast.LENGTH_SHORT).show();
            }
        }));



    }


    class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0,0,getResources().getDimensionPixelOffset(R.dimen.dividerHeight),0);
        }
    }

}
