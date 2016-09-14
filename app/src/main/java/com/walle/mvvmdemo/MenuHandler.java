package com.walle.mvvmdemo;

import android.content.Intent;
import android.view.View;

import com.walle.mvvmdemo.LoginDemo.MainActivity;
import com.walle.mvvmdemo.attribute.AttributeActivity;
import com.walle.mvvmdemo.converter.ConverterActivity;
import com.walle.mvvmdemo.event.EventActivity;
import com.walle.mvvmdemo.include.IncludeActivity;
import com.walle.mvvmdemo.list.ListActivity;
import com.walle.mvvmdemo.viewstub.ViewStubActivity;

/**
 * Created by void on 16/9/6
 */
public class MenuHandler {
    public void onClick(View view){
        Intent intent = null;
        switch (view.getId()){
            case R.id.event:
                intent = new Intent(view.getContext(), EventActivity.class);
                break;
            case R.id.attribute:
                intent = new Intent(view.getContext(), AttributeActivity.class);
                break;
            case R.id.converter:
                intent = new Intent(view.getContext(), ConverterActivity.class);
                break;
            case R.id.viewstub:
                intent = new Intent(view.getContext(), ViewStubActivity.class);
                break;
            case R.id.login:
                intent = new Intent(view.getContext(), MainActivity.class);
                break;
            case R.id.recycle:
                intent = new Intent(view.getContext(), ListActivity.class);
                break;
            case R.id.include:
                intent = new Intent(view.getContext(), IncludeActivity.class);
                break;
            default:
        }
        if(intent!=null)
            view.getContext().startActivity(intent);
    }
}
