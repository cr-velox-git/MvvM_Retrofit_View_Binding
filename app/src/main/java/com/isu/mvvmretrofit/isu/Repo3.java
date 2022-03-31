package com.isu.mvvmretrofit.isu;

import androidx.lifecycle.MutableLiveData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repo3 {

    public MutableLiveData<DataResponse> requestData(DataRequestApi dataRequestApi){
        final MutableLiveData<DataResponse> mutableLiveData = new MutableLiveData<>();

        ApiInterface3 apiInterface3 =RetrofitUtility3.getRetrofitClient().create(ApiInterface3.class);
        apiInterface3.getData(dataRequestApi).enqueue(new Callback<DataResponse>() {
            @Override
            public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
                if (response.isSuccessful()&&response.body()!=null){
                   //we can extract data like this
                    int status = response.body().getStatus();
                    String message = response.body().getMessage();
                    String status1=response.body().getData().getStatus();
                    int sub_status = response.body().getData().getSubStatus();
                    String sub_desc = response.body().getData().getStatusDesc();
                    mutableLiveData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<DataResponse> call, Throwable t) {
                //throw error
            }
        });
        return mutableLiveData;
    }
}
