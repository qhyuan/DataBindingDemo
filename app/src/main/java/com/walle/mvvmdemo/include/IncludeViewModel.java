package com.walle.mvvmdemo.include;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import com.walle.mvvmdemo.BR;
/**
 * Created by void on 16/9/7.
 */
public class IncludeViewModel extends BaseObservable{
//    public ObservableField<String> includeMsg = new ObservableField<>();
    private String includeMsg;

    @Bindable
    public String getIncludeMsg() {
        return includeMsg;
    }

    public void setIncludeMsg(String includeMsg) {
        this.includeMsg = includeMsg;
        notifyPropertyChanged(BR.includeMsg);
    }
}
