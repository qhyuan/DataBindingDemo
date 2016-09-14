package com.walle.mvvmdemo.LoginDemo;

import android.util.Log;
import android.view.View;

/**
 * Created by void on 16/8/22
 */
public class LoginHandler {
    public void onClick(View view){
        Log.e("MVVM",view.toString());
    }
    public void onClick(LoginViewModel login){
        Log.e("Login",login.getName()+"--"+login.getPassWord());
        login.setProgressVisiable(true);
        login.login();
    }
}
