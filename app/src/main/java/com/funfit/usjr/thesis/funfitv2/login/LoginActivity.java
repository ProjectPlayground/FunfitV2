package com.funfit.usjr.thesis.funfitv2.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.funfit.usjr.thesis.funfitv2.R;

import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @OnClick(R.id.facebookBtn)
    public void loginFacebook(){
//        startActivity();
    }
}