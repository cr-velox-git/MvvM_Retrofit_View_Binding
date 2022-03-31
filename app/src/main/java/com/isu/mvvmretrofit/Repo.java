package com.isu.mvvmretrofit;


import androidx.lifecycle.MutableLiveData;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repo {

    private final String TAG = getClass().getSimpleName();

    public MutableLiveData<List<Model>> requestHolidays(){
        //first we are creating adapt mutableLiveData object to pass it further
        final MutableLiveData<List<Model>> mutableLiveData = new MutableLiveData<>();


        ApiInterface apiService = RetrofitUtility.getRetrofitClient().create(ApiInterface.class);
        //getHolidays() is initialize and call from interface class
        apiService.getHolidays().enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {
                if (response.isSuccessful() && response.body()!=null){
                    mutableLiveData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {
                //throw error
            }
        });
        return mutableLiveData;
    }

}
