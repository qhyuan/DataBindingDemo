package com.walle.mvvmdemo.list;

import android.databinding.BaseObservable;
import android.support.v7.widget.RecyclerView;

public class ListActivityModel extends BaseObservable {

    private RecyclerView.Adapter adapter;

    public RecyclerView.Adapter getAdapter() {
        return adapter;
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        this.adapter = adapter;
    }


}
