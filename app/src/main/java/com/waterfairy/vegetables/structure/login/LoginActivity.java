package com.waterfairy.vegetables.structure.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.waterfairy.vegetables.R;
import com.waterfairy.vegetables.structure.home.activity.SelectServiceActivity;
import com.waterfairy.widget.ScaleImageView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "LoginActivity";
    private ScaleImageView mSIVLoginWeChart, mSIVLoginQQ;
    private EditText mTVAccount, mTVPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findView();
        initView();
        initData();
    }

    private void initData() {

    }

    private void initView() {
        mSIVLoginWeChart.setOnClickListener(this);
        mSIVLoginQQ.setOnClickListener(this);
    }

    private void findView() {
        mSIVLoginWeChart = findViewById(R.id.siv_login_wx);
        mSIVLoginQQ = findViewById(R.id.siv_login_qq);
        mTVAccount = findViewById(R.id.et_account);
        mTVPassword = findViewById(R.id.et_password);
    }


    public void onLoginClick(View view) {
//        Log.i(TAG, "onLoginClick: " + view.getId());
        switch (view.getId()) {
            case R.id.bt_login:
                startActivity(new Intent(this, SelectServiceActivity.class));
                break;
        }
    }

    @Override
    public void onClick(View v) {
        onLoginClick(v);
    }
}
