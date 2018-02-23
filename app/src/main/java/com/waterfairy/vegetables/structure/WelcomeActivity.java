package com.waterfairy.vegetables.structure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.waterfairy.vegetables.R;
import com.waterfairy.vegetables.structure.login.LoginActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        startActivity(new Intent(this, LoginActivity.class));
    }
}
