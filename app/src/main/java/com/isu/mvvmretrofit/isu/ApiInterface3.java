package com.isu.mvvmretrofit.isu;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface3 {
    //IN postModel if any int value are there the gson parser will auto convert
    //it into 0 so all variable must be string.
    //in call we need to pass response model
    @POST("/initiate_merchant_onboard")
    Call<DataResponse> getData(@Body DataRequestApi dataRequestApi);
}
