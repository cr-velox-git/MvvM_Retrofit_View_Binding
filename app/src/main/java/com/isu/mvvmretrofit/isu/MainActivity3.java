package com.isu.mvvmretrofit.isu;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.isu.mvvmretrofit.R;
import com.isu.mvvmretrofit.databinding.ActivityMain3Binding;


public class MainActivity3 extends AppCompatActivity {

    ActivityMain3Binding binding;
    AppViewModel3 appViewModel3 = new AppViewModel3();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main3);
        binding.setDataResponseViewModel(appViewModel3);
        binding.executePendingBindings();


        DataRequestApi dataRequestApi = new DataRequestApi();
        dataRequestApi.setDeviceId("21978777");
        dataRequestApi.setUserName("demoisu");
        dataRequestApi.setAccountNumber("091801507361");
        dataRequestApi.setBankName("ICICI BANK");
        dataRequestApi.setIfscCode("ICIC0007311");
        dataRequestApi.setGstNumber("GSTIN12344567");
        dataRequestApi.setBankCode("176");
        dataRequestApi.setEmail("demoisu123@gmail.com");
        dataRequestApi.setBeneName("demoisu BBSR");

        appViewModel3.getResponse(dataRequestApi).observe(this, new Observer<DataResponse>() {
            @Override
            public void onChanged(DataResponse dataResponse) {
                Toast.makeText(MainActivity3.this, dataResponse.getMessage(), Toast.LENGTH_SHORT).show();
           binding.textview.setText(dataResponse.getData().getStatusDesc());
            }
        });
    }
}