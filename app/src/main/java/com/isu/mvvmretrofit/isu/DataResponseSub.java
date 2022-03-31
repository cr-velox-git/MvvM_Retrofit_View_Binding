package com.isu.mvvmretrofit.isu;

import com.google.gson.annotations.SerializedName;

public class DataResponseSub {

	@SerializedName("sub_status")
	private Integer subStatus;

	@SerializedName("status_desc")
	private String statusDesc;

	@SerializedName("status")
	private String status;

	public Integer getSubStatus(){
		return subStatus;
	}

	public String getStatusDesc(){
		return statusDesc;
	}

	public String getStatus(){
		return status;
	}
}