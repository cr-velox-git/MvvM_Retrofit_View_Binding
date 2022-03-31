package com.isu.mvvmretrofit;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;


/**
 *retrofit is used to fetch the data from api we are extending it with application
 *
 * **/
public class RetrofitUtility extends Application {
    final String TAG = getClass().getSimpleName();
    private static RetrofitUtility mInstance;
    private static Retrofit retrofit = null;
    private static String BASE_URL = "https://date.nager.at/api/v2/";

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

    }

    public static synchronized RetrofitUtility getmInstance() {
        return mInstance;
    }

    public static Retrofit getRetrofitClient() {
        if (retrofit == null) {
            okhttp3.OkHttpClient client = new okhttp3.OkHttpClient.Builder().build();
            retrofit = new Retrofit.Builder()
                    .client(client)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BASE_URL)
                    .build();
        }
        return retrofit;
    }
}
