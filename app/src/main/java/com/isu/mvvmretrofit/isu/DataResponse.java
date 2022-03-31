package com.isu.mvvmretrofit.isu;

import com.google.gson.annotations.SerializedName;

public class DataResponse {

	@SerializedName("data")
	private DataResponseSub data;

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private Integer status;

	public DataResponseSub getData(){
		return data;
	}

	public String getMessage(){
		return message;
	}

	public Integer getStatus(){
		return status;
	}
}