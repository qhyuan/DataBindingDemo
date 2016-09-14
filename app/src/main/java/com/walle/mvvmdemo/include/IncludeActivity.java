package com.walle.mvvmdemo.include;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.walle.mvvmdemo.R;
import com.walle.mvvmdemo.databinding.ActivityIncludeBinding;

public class IncludeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityIncludeBinding binding =
                DataBindingUtil.setContentView(this,R.layout.activity_include);
        IncludeViewModel model = new IncludeViewModel();
        model.setIncludeMsg("include");
        binding.setInclude(model);
    }
}
