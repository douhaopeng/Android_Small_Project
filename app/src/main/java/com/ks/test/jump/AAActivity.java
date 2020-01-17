package com.ks.test.jump;

        import android.content.ComponentName;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;

        import com.ks.test.R;

public class AAActivity extends AppCompatActivity {

    private Button mBtnJump;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aa);

        mBtnJump = (Button) findViewById(R.id.jump);

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
}


