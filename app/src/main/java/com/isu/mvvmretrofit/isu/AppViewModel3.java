package com.isu.mvvmretrofit.isu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AppViewModel3 extends ViewModel {
    private Repo3 repo;
    private MutableLiveData<DataResponse> mutableLiveData;

    public AppViewModel3() {
        repo = new Repo3();
    }

    public LiveData<DataResponse> getResponse(DataRequestApi dataRequestApi) {
        if (mutableLiveData == null) {
            mutableLiveData = repo.requestData(dataRequestApi);
        }
        return mutableLiveData;
    }
}
