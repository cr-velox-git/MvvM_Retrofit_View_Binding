package com.isu.mvvmretrofit.isu;

import com.google.gson.annotations.SerializedName;

public class DataRequestApi{

	@SerializedName("ifsc_code")
	private String ifscCode;

	@SerializedName("account_number")
	private String accountNumber;

	@SerializedName("bankCode")
	private String bankCode;

	@SerializedName("device_id")
	private String deviceId;

	@SerializedName("user_name")
	private String userName;

	@SerializedName("bank_name")
	private String bankName;

	@SerializedName("gst_number")
	private String gstNumber;

	@SerializedName("email")
	private String email;

	@SerializedName("bene_name")
	private String beneName;

	public void setIfscCode(String ifscCode){
		this.ifscCode = ifscCode;
	}

	public String getIfscCode(){
		return ifscCode;
	}

	public void setAccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber(){
		return accountNumber;
	}

	public void setBankCode(String bankCode){
		this.bankCode = bankCode;
	}

	public String getBankCode(){
		return bankCode;
	}

	public void setDeviceId(String deviceId){
		this.deviceId = deviceId;
	}

	public String getDeviceId(){
		return deviceId;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return userName;
	}

	public void setBankName(String bankName){
		this.bankName = bankName;
	}

	public String getBankName(){
		return bankName;
	}

	public void setGstNumber(String gstNumber){
		this.gstNumber = gstNumber;
	}

	public String getGstNumber(){
		return gstNumber;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setBeneName(String beneName){
		this.beneName = beneName;
	}

	public String getBeneName(){
		return beneName;
	}
}