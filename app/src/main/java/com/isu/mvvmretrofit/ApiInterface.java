package com.isu.mvvmretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    //calling the getHolidays() from repo class
    @GET("PublicHolidays/2021/us")
    Call<List<Model>> getHolidays();
}
