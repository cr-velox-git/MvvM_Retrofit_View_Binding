package com.isu.mvvmretrofit.isu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.isu.mvvmretrofit.R;
import com.isu.mvvmretrofit.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMain3Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main3);

        AppViewModel3 appViewModel3 = new AppViewModel3();

        binding.setViewModel(appViewModel3);
        binding.setLifecycleOwner(this);

        binding.executePendingBindings();
    }
}
