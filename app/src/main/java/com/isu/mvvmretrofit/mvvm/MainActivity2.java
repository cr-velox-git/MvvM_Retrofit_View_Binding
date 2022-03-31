package com.isu.mvvmretrofit.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.isu.mvvmretrofit.R;
import com.isu.mvvmretrofit.databinding.ActivityMain2Binding;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // ViewModel updates the Model
        // after observing changes in the View

        // model will also update the view
        // via the ViewModel
        ActivityMain2Binding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main2);
        activityMainBinding.setViewModel2(new AppViewModel2());//coming from xml file
        activityMainBinding.executePendingBindings();

    }

    // any change in toastMessage attribute
    // defined on the Button with bind prefix
    // invokes this method
    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }
}
