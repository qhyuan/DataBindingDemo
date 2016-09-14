package com.walle.mvvmdemo.viewstub;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewStub;

import com.walle.mvvmdemo.R;
import com.walle.mvvmdemo.databinding.ActivityViewStubBinding;
import com.walle.mvvmdemo.databinding.StubBinding;

public class ViewStubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityViewStubBinding binding =
                DataBindingUtil.setContentView(this,R.layout.activity_view_stub);

        binding.viewStubTest.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub stub, View inflated) {
                Log.e("onInflate","onInflate");
                StubBinding stubBinding = DataBindingUtil.bind(inflated);
                ViewStubViewModel model = new ViewStubViewModel();
                model.setName("boco");
                stubBinding.setStubModel(model);
            }
        });
        binding.viewStubTest.getViewStub().inflate();
    }
}
