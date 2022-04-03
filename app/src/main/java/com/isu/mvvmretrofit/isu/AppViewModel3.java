package com.isu.mvvmretrofit.isu;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AppViewModel3 extends ViewModel {

    private Repo3 repo;

    public MutableLiveData<DataResponse> mutableLiveData = new MutableLiveData<DataResponse>();

    public AppViewModel3() {
        repo = new Repo3();
    }

    public DataRequestApi inputData = new DataRequestApi();

    public void getResponse() {

        repo.requestData(inputData, new Callback<DataResponse>() {
            @Override
            public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
                DataResponse responseData = response.body();
                mutableLiveData.postValue(responseData);
            }

            @Override
            public void onFailure(Call<DataResponse> call, Throwable t) {

            }
        });
    }
}
