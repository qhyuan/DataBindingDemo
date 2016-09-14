package com.walle.mvvmdemo.LoginDemo;

import android.app.Activity;
import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.databinding.BindingConversion;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.widget.Button;

import com.walle.mvvmdemo.BR;
import com.walle.mvvmdemo.converter.ConverterActivity;

public class LoginViewModel extends BaseObservable {
    private static final String TAG = "Login";
    private final Activity activity;
    private String name;
    private String passWord;
    private boolean isProgressVisiable;

    public LoginViewModel(Activity activity){
        this.activity = activity;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }


    @Bindable
    public String getPassWord() {
        return passWord;
    }


    public void setPassWord(String passWord) {
        this.passWord = passWord;
        notifyPropertyChanged(BR.passWord);
    }

    @Bindable
    public boolean isProgressVisiable() {
        return isProgressVisiable;
    }

    public void setProgressVisiable(boolean progressVisiable) {
        isProgressVisiable = progressVisiable;
        notifyPropertyChanged(BR.progressVisiable);
    }
//////////-----------!!!!!!!!!!!!!!!!!!!--------------/////////
    @BindingConversion
    public static Drawable toDrawable(String color) {
        int length = color==null ? 0: color.length();
        if(length==1)
            return new ColorDrawable(Color.WHITE);
        if (length==2)
            return new ColorDrawable(Color.BLUE);
        return new ColorDrawable(Color.GRAY);
    }

    @BindingAdapter({"app:myText"})
    public static void showText(Button button,String oldV,String newV){
        button.setText(newV);
        Log.w(TAG,"new="+newV+"--oldV="+oldV);
    }


    public void login() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                setProgressVisiable(false);
                Intent intent = new Intent(activity, ConverterActivity.class);
                activity.startActivity(intent);
            }
        },2000);
    }
}
