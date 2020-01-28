package com.ks.test.datacc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.ks.test.R;

public class DataStoreActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mBtnSharedPerfernce;
    private Button mBtnFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_store);
        mBtnSharedPerfernce = (Button) findViewById(R.id.btn_sharedPrefrences);
        mBtnFile = (Button) findViewById(R.id.btn_file);

        mBtnSharedPerfernce.setOnClickListener(this);
        mBtnFile.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent = null;
        switch (v.getId()){
            case R.id.btn_sharedPrefrences:
                intent = new Intent(DataStoreActivity.this,SharedPerenceActivity.class);
                break;
            case R.id.btn_file:
                intent = new Intent(DataStoreActivity.this,FileActivity.class);
                break;
        }
        startActivity(intent);
    }
}
