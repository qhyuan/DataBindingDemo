package com.walle.mvvmdemo.list;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.walle.mvvmdemo.BR;

/**
 * Created by void on 16/9/6
 */
public class ItemViewModel extends BaseObservable {
    private int pos;

    @Bindable
    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
        notifyPropertyChanged(BR.pos);
    }

}
