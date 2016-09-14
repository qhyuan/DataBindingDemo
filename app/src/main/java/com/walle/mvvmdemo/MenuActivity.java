package com.walle.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.walle.mvvmdemo.databinding.ActivityMenuBinding;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMenuBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_menu);
        binding.setMenuHandler(new MenuHandler());
    }
}
