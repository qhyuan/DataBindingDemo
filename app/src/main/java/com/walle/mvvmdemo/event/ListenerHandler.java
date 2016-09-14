package com.walle.mvvmdemo.event;

import android.support.v7.widget.AppCompatButton;
import android.widget.Toast;

public class ListenerHandler {
    public void myListener(AppCompatButton view, String msg){
        Toast.makeText(view.getContext(),view.getText()+"--"+msg,Toast.LENGTH_LONG).show();
    }
}
