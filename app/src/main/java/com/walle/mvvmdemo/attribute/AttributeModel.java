package com.walle.mvvmdemo.attribute;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.databinding.BindingMethod;
import android.databinding.BindingMethods;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import com.walle.mvvmdemo.BR;

@BindingMethods({
        @BindingMethod(type = android.widget.Button.class,
                attribute = "myTouch",
                method = "setOnTouchListener"),})
public class AttributeModel extends BaseObservable{
    private View.OnTouchListener touchListener;

    @Bindable
    public View.OnTouchListener getTouchListener() {
        return touchListener;
    }

    public void setTouchListener(View.OnTouchListener touchListener) {
        this.touchListener = touchListener;
        notifyPropertyChanged(BR.touchListener);
    }

    @BindingAdapter({"bind:myTouch"})
    public static void setListener(AppCompatButton button,
                                   View.OnTouchListener oldValue, View.OnTouchListener newValue){
        button.setOnTouchListener(newValue);
    }
    //OR
   /* @BindingAdapter({"bind:myTouch"})
    public static void setListener(AppCompatButton button,View.OnTouchListener newValue){
        button.setOnTouchListener(newValue);
    }*/

}
