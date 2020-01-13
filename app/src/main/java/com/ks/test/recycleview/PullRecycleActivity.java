package com.ks.test.recycleview;

        import android.graphics.Rect;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.RecyclerView;
        import android.support.v7.widget.StaggeredGridLayoutManager;
        import android.view.View;
        import android.widget.Toast;

        import com.ks.test.R;

public class PullRecycleActivity extends AppCompatActivity {

    private RecyclerView mRvPu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pull_recycle);
        mRvPu = (RecyclerView) findViewById(R.id.rv_pu);
        mRvPu.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        mRvPu.addItemDecoration(new MyDecoration());
        mRvPu.setAdapter(new StaggerAdapter(PullRecycleActivity.this, new StaggerAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(PullRecycleActivity.this,"click+"+pos,Toast.LENGTH_SHORT).show();
            }
        }));
    }

    class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            int gap = getResources().getDimensionPixelOffset(R.dimen.dividerHeight5);
            outRect.set(gap,gap,gap,gap);
        }
    }
}
