package com.isu.mvvmretrofit;

import androidx.annotation.Nullable;

public class Model {

    @Nullable
    String date, name;

    public Model(@Nullable String date, @Nullable String name) {
        this.date = date;
        this.name = name;
    }

    @Nullable
    public String getDate() {
        return date;
    }

    public void setDate(@Nullable String date) {
        this.date = date;
    }

    @Nullable
    public String getName() {
        return name;
    }

    public void setName(@Nullable String name) {
        this.name = name;
    }
}
