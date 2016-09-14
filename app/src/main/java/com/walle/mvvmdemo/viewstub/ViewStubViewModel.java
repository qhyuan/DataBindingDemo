package com.walle.mvvmdemo.viewstub;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import  com.walle.mvvmdemo.BR;
public class ViewStubViewModel extends BaseObservable{
    private String name;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
}
