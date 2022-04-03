package com.isu.mvvmretrofit.isu;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repo3 {

    public void requestData(DataRequestApi dataRequestApi, Callback<DataResponse> responseCallback) {

        ApiInterface3 apiInterface3 = RetrofitUtility3.getRetrofitClient().create(ApiInterface3.class);
        apiInterface3.getData(dataRequestApi).enqueue(new Callback<DataResponse>() {
            @Override
            public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
                responseCallback.onResponse(call, response);
            }

            @Override
            public void onFailure(Call<DataResponse> call, Throwable t) {
                responseCallback.onFailure(call, t);
            }
        });
    }
}
