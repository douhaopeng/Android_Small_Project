package com.ks.test;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

        import com.ks.test.ListView.ListtViewActivity;

public class MainActivity extends AppCompatActivity {

    private Button mBtnCheckBox;
    private Button mBtnTextView;
    private Button mBtbButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnImageView;
    private Button mBtnListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = (Button) findViewById(R.id.btn_textview);
        mBtbButton = (Button) findViewById(R .id.btn_button);
        mBtnEditText = (Button) findViewById(R.id.btn_edittext);
        mBtnRadioButton = (Button) findViewById(R.id.btn_radiobutton);
        mBtnCheckBox = (Button) findViewById(R.id.btn_checkbox);
        mBtnImageView = (Button) findViewById(R.id.btn_imageview);
        mBtnListView = (Button) findViewById(R.id.btn_listview);
        setListener();
    }

    private  void setListener(){

        OnClick onClick = new OnClick();
        mBtnTextView.setOnClickListener(onClick);
        mBtbButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnRadioButton.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);
        mBtnListView.setOnClickListener(onClick);

    }
    public class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            Intent intent = null;
            switch (v.getId()){

                case R.id.btn_textview:
                     intent = new Intent(MainActivity.this,Main2Activity.class);

                    break;
                case R.id.btn_button:
                     intent = new Intent(MainActivity.this,ButtonActivity.class);

                    break;
                case R.id.btn_edittext:
                     intent = new Intent(MainActivity.this,EditTextActivity.class);

                    break;
                case R.id.btn_radiobutton:
                     intent = new Intent(MainActivity.this,RadioButtonActivity.class);

                    break;
                case R.id.btn_checkbox:
                    intent = new Intent(MainActivity.this,CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    intent = new Intent(MainActivity.this,imageViewActivity.class);
                    break;
                case R.id.btn_listview:
                    intent = new Intent(MainActivity.this,ListtViewActivity.class);
                    break;

            }
            startActivity(intent);
        }
    }
}




