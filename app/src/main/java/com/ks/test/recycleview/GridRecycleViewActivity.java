package com.ks.test.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.ks.test.R;
import com.ks.test.gridview.GridViewActivity;

public class GridRecycleViewActivity extends AppCompatActivity {


    private RecyclerView mRvGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_recycle_view);
        mRvGrid = (RecyclerView) findViewById(R.id.rv_grid);
        mRvGrid.setLayoutManager(new GridLayoutManager(GridRecycleViewActivity.this,3));
        mRvGrid.setAdapter(new GridAdapter(GridRecycleViewActivity.this, new GridAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(GridRecycleViewActivity.this,"click+"+pos,Toast.LENGTH_SHORT).show();
            }
        }));
    }
}
