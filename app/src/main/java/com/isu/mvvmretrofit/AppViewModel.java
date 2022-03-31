package com.isu.mvvmretrofit;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class AppViewModel extends ViewModel {

    private Repo repo; //it is a object
    private MutableLiveData<List<Model>> mutableLiveData; //this mutable live data observe the data change and
    // notify the other objects

    public AppViewModel() {
        repo = new Repo();
    }

    public LiveData<List<Model>> getHolidays(){
        if (mutableLiveData ==  null){
            mutableLiveData = repo.requestHolidays();
        }
        return  mutableLiveData;
    }
}
