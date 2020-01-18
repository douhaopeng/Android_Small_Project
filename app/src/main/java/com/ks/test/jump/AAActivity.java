package com.ks.test.jump;

        import android.app.Activity;
        import android.content.ComponentName;
        import android.content.Intent;
        import android.content.pm.ActivityInfo;
        import android.content.pm.PackageManager;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;

        import com.ks.test.R;

public class AAActivity extends AppCompatActivity {

    private Button mBtnJump;
    private Button mBtnJump2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aa);
        Log.d("AActivity","Oncreat.....");
        Log.d("AActivity","task"+getTaskId()+","+"hash:"+hashCode());
        try {
            logTaskName();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }


        mBtnJump = (Button) findViewById(R.id.jump);

        mBtnJump2 = (Button) findViewById(R.id.jump2);
        mBtnJump2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AAActivity.this,AAActivity.class);

                startActivity(intent);
            }
        });
        mBtnJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AAActivity.this,BActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name","天哥");
                bundle.putInt("number",88);
                intent.putExtras(bundle);
//                startActivity(intent);
                startActivityForResult(intent,0);

//                Intent intent = new Intent();
//                intent.setClass(AAActivity.this,BActivity.class);
//                startActivity(intent);


//                Intent intent = new Intent();
//                intent.setClassName(AAActivity.this,"com.ks.test.jump.BActivity");
//                startActivity(intent);

//                Intent intent = new Intent();
//                intent.setComponent(new ComponentName(AAActivity.this,"com.ks.test.jump.BActivity"));
//                startActivity(intent);

//                Intent intent = new Intent();
//
//                intent.setAction("com.ks.test.jump.BActivity");
//                startActivity(intent);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Toast.makeText(AAActivity.this,data.getExtras().getString("title"),Toast.LENGTH_LONG).show();
    }

    private  void logTaskName() throws PackageManager.NameNotFoundException {

        ActivityInfo info = getPackageManager().getActivityInfo(getComponentName(), PackageManager.GET_META_DATA);
        Log.d("AActivity",info.taskAffinity);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        Log.d("AActivity","Oncreat.....");
        Log.d("AActivity","task"+getTaskId()+","+"hash:"+hashCode());
        try {
            logTaskName();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

    }
}


