package com.isu.mvvmretrofit.isu;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitUtility3 extends Application {

    private static RetrofitUtility3 retrofitUtility3;
    private static Retrofit retrofit = null;
    private static String BASE_URL_3 = "https://paynext-pos-onboarding-staging-twdwtabx5q-el.a.run.app/";

    @Override
    public void onCreate() {
        super.onCreate();
        retrofitUtility3 = this;
    }

    public static synchronized RetrofitUtility3 getRetrofitUtility3() {
        return retrofitUtility3;
    }

    public static Retrofit getRetrofitClient() {
        if (retrofit == null) {
            okhttp3.OkHttpClient client = new okhttp3.OkHttpClient.Builder().build();
            retrofit = new Retrofit.Builder()
                    .client(client)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BASE_URL_3)
                    .build();
        }
        return retrofit;
    }
}
