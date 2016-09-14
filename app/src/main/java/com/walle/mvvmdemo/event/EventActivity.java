package com.walle.mvvmdemo.event;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.walle.mvvmdemo.R;
import com.walle.mvvmdemo.databinding.ContentEventBinding;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ContentEventBinding binding = DataBindingUtil.setContentView(this,R.layout.content_event);
        binding.setMsg("hello");
        binding.setMethodHandler(new MethodHandler());
        binding.setListenerHandler(new ListenerHandler());
    }

}
