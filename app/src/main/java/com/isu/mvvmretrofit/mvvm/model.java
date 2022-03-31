package com.isu.mvvmretrofit.mvvm;

import androidx.annotation.Nullable;

class Model2 {

    @Nullable
    String email,password;

    // constructor to initialize
    // the variables
    public Model2(String email, String password){
        this.email = email;
        this.password = password;
    }

    // getter and setter methods
    // for email variable
    @Nullable
    public String getEmail() {
        return email;
    }

    public void setEmail(@Nullable String email) {
        this.email = email;
    }

    // getter and setter methods
    // for password variable
    @Nullable
    public String getPassword() {
        return password;
    }

    public void setPassword(@Nullable String password) {
        this.password = password;
    }

}