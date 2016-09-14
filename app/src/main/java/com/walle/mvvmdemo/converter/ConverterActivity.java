package com.walle.mvvmdemo.converter;

import android.databinding.BindingConversion;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.walle.mvvmdemo.R;

public class ConverterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this,R.layout.activity_converter);
    }

    @BindingConversion
    public static ColorDrawable convertColor(int color) {
        return new ColorDrawable(Color.RED);
    }

}
