package com.walle.mvvmdemo.list;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.walle.mvvmdemo.BR;
import com.walle.mvvmdemo.R;
import com.walle.mvvmdemo.databinding.ActivityListBinding;

public class ListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityListBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_list);
        ListActivityModel model = new ListActivityModel();
        MyAdapter myAdapter = new MyAdapter();
        model.setAdapter(myAdapter);
        binding.setViewModel(model);
    }

     class MyAdapter extends RecyclerView.Adapter<MyAdapter.Holder>{

         @Override
         public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
             LayoutInflater inflater = LayoutInflater.from(parent.getContext());
             ViewDataBinding binding = DataBindingUtil.inflate(inflater, R.layout.item_list, parent, false);
             Holder holder = new Holder(binding.getRoot());
             holder.setBindding(binding);
             return holder;
         }

         @Override
         public void onBindViewHolder(Holder holder, int position) {
             ItemViewModel model = new ItemViewModel();
             model.setPos(position);
             holder.bindding.setVariable(BR.viewModel,model);
         }

         @Override
         public int getItemCount() {
             return 100;
         }

         public class Holder extends RecyclerView.ViewHolder{

             private ViewDataBinding bindding;

             public Holder(View itemView) {
                super(itemView);
            }

             public void setBindding(ViewDataBinding bindding) {
                 this.bindding = bindding;
             }
         }
    }

}
