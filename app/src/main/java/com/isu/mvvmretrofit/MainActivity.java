package com.isu.mvvmretrofit;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.isu.mvvmretrofit.databinding.ActivityMainBinding;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    final String TAG = getClass().getSimpleName();
    ActivityMainBinding binding;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // ViewModel updates the Model
        // after observing changes in the View

        // model will also update the view
        // via the ViewModel
        //binding data
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(RecyclerView.VERTICAL);
        adapter = new Adapter();
        binding.recycleView.setLayoutManager(manager);
        binding.recycleView.setAdapter(adapter);
        binding.progressBar.setVisibility(View.VISIBLE);


        AppViewModel appViewModel = new AppViewModel();
        appViewModel.getHolidays().observe(this, new Observer<List<Model>>() {
            @Override
            public void onChanged(List<Model> models) {
                if (models != null && !models.isEmpty()) {
                    binding.progressBar.setVisibility(View.GONE);

//                    modelList.add(models);
                    adapter.addModelList(models);
                    adapter.notifyDataSetChanged();
                }
            }
        });


    }
}
