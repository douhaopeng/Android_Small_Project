package com.ks.test.jump;

        import android.content.Intent;
        import android.content.pm.ActivityInfo;
        import android.content.pm.PackageManager;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import com.ks.test.R;

public class BActivity extends AppCompatActivity {

    private TextView mTvTitle;
    private Button mBtnFinish,mBtnFinish2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Log.d("BActivity","Oncreat.....");
        Log.d("BActivity","task"+getTaskId()+","+"hash:"+hashCode());
        try {
            logTaskName();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        mTvTitle = (TextView) findViewById(R.id.tv_title);
        mBtnFinish = (Button) findViewById(R.id.btn_finish);
        mBtnFinish2 = (Button) findViewById(R.id.btn_2);
        Bundle bundle = getIntent().getExtras();
       String name =  bundle.getString("name");
        int number =   bundle.getInt("number");
        mTvTitle.setText(name+""+number);

        mBtnFinish2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BActivity.this,AAActivity.class);
                startActivity(intent);

            }
        });
        mBtnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent();
                Bundle bundle1 = new Bundle();
                bundle1.putString("title","我回来了");
                setResult(AAActivity.RESULT_OK,intent);
                finish();
            }
        });
    }

    private  void logTaskName() throws PackageManager.NameNotFoundException {

        ActivityInfo info = getPackageManager().getActivityInfo(getComponentName(), PackageManager.GET_META_DATA);
        Log.d("BActivity",info.taskAffinity);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        Log.d("BActivity","Oncreat.....");
        Log.d("BActivity","task"+getTaskId()+","+"hash:"+hashCode());
        try {
            logTaskName();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

    }
}
