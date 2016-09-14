package com.walle.mvvmdemo.LoginDemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.walle.mvvmdemo.R;
import com.walle.mvvmdemo.databinding.ActivityLoginBinding;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityLoginBinding loginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        LoginViewModel login = new LoginViewModel(this);
        login.setName("boco");
        login.setPassWord("boco");
        login.setProgressVisiable(false);

        loginBinding.setLogin(login);
        loginBinding.setLoginHandler(new LoginHandler());
    }
}
