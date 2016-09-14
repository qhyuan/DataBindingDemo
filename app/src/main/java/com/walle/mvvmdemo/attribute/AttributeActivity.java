package com.walle.mvvmdemo.attribute;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.walle.mvvmdemo.R;
import com.walle.mvvmdemo.databinding.ActivityAttributeBinding;


public class AttributeActivity extends AppCompatActivity implements View.OnTouchListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAttributeBinding binding =
                DataBindingUtil.setContentView(this,R.layout.activity_attribute);
        AttributeModel model = new AttributeModel();
        model.setTouchListener(this);
        binding.setAttributeModel(model);

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if(event.getPointerCount()==1){
            CharSequence text = ((AppCompatButton) v).getText();
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}
