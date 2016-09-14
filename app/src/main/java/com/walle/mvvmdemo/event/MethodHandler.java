package com.walle.mvvmdemo.event;

import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;


public class MethodHandler {
    public void myOnClick(View view){
        Toast.makeText(view.getContext(),((AppCompatButton)view).getText(),Toast.LENGTH_LONG).show();
    }
}
