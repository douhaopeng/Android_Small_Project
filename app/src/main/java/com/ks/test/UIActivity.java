package com.ks.test;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

        import com.ks.test.ListView.ListtViewActivity;
        import com.ks.test.gridview.GridViewActivity;
        import com.ks.test.jump.AAActivity;
        import com.ks.test.recycleview.RecycleViewActivity;

public class UIActivity extends AppCompatActivity {

    private Button mBtnCheckBox;
    private Button mBtnTextView;
    private Button mBtbButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnImageView;
    private Button mBtnListView;
    private Button mBtnGridView;
    private Button mBtnRecycleView;
    private Button mBtnWebView;
    private Button mBtnToast;
    private Button mBtnDialog;
    private Button mBtnProgress;
    private Button mBtnPop;
    private Button mBtnLife;
    private Button mBtnJump;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
        mBtnTextView = (Button) findViewById(R.id.btn_textview);
        mBtbButton = (Button) findViewById(R .id.btn_button);
        mBtnEditText = (Button) findViewById(R.id.btn_edittext);
        mBtnRadioButton = (Button) findViewById(R.id.btn_radiobutton);
        mBtnCheckBox = (Button) findViewById(R.id.btn_checkbox);
        mBtnImageView = (Button) findViewById(R.id.btn_imageview);
        mBtnListView = (Button) findViewById(R.id.btn_listview);
        mBtnGridView = (Button) findViewById(R.id.btn_gridview);
        mBtnRecycleView = (Button) findViewById(R.id.btn_Recycleview);
        mBtnWebView = (Button) findViewById(R.id.btn_Webview);
        mBtnToast = (Button) findViewById(R.id.btn_Toast);
        mBtnDialog = (Button) findViewById(R.id.btn_dialog);
        mBtnProgress = (Button) findViewById(R.id.btn_progress);
        mBtnPop = (Button) findViewById(R.id.btn_popwindow);
        mBtnLife = (Button) findViewById(R.id.btn_life);
        mBtnJump = (Button) findViewById(R.id.btn_jump);
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
        mBtnGridView.setOnClickListener(onClick);
        mBtnRecycleView.setOnClickListener(onClick);
        mBtnWebView.setOnClickListener(onClick);
        mBtnToast.setOnClickListener(onClick);
        mBtnLife.setOnClickListener(onClick);
        mBtnPop.setOnClickListener(onClick);
        mBtnProgress.setOnClickListener(onClick);
        mBtnDialog.setOnClickListener(onClick);
        mBtnJump.setOnClickListener(onClick);

    }
     class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            Intent intent = null;
            switch (v.getId()){

                case R.id.btn_textview:
                     intent = new Intent(UIActivity.this,Main2Activity.class);

                    break;
                case R.id.btn_button:
                     intent = new Intent(UIActivity.this,ButtonActivity.class);

                    break;
                case R.id.btn_edittext:
                     intent = new Intent(UIActivity.this,EditTextActivity.class);

                    break;
                case R.id.btn_radiobutton:
                     intent = new Intent(UIActivity.this,RadioButtonActivity.class);

                    break;
                case R.id.btn_checkbox:
                    intent = new Intent(UIActivity.this,CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    intent = new Intent(UIActivity.this,imageViewActivity.class);
                    break;
                case R.id.btn_listview:
                    intent = new Intent(UIActivity.this,ListtViewActivity.class);
                    break;
                case R.id.btn_gridview:
                    intent = new Intent(UIActivity.this,GridViewActivity.class);
                    break;
                case R.id.btn_Recycleview:
                    intent = new Intent(UIActivity.this,RecycleViewActivity.class);
                    break;
                case R.id.btn_Webview:
                    intent = new Intent(UIActivity.this,WebViewActivity.class);
                    break;

                case R.id.btn_Toast:
                    intent = new Intent(UIActivity.this,ToastActivity.class);
                    break;
                case R.id.btn_dialog:
                    intent = new Intent(UIActivity.this,DailogActivity.class);
                    break;
                case R.id.btn_progress:
                    intent = new Intent(UIActivity.this,ProgressActivity.class);
                    break;
                case R.id.btn_popwindow:
                    intent = new Intent(UIActivity.this,popupWIndowActivity.class);
                    break;
                case R.id.btn_life:
                    intent = new Intent(UIActivity.this,LifeActivity.class);
                    break;
                case R.id.btn_jump:
                    intent = new Intent(UIActivity.this,AAActivity.class);
                    break;



            }
            startActivity(intent);
        }
    }
}




