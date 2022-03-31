package com.isu.mvvmretrofit.isu;

public class PostModel {


    String device_id, account_number, bankCode, user_name, bank_name, ifsc_code, gst_number, email, bene_name;

    public PostModel(
            String device_id,
            String user_name,
            String account_number,
            String bank_name,
            String ifsc_code,
            String gst_number,
            String bankCode,
            String email,
            String bene_name
    ) {
        this.device_id = device_id;
        this.account_number = account_number;
        this.bankCode = bankCode;
        this.user_name = user_name;
        this.bank_name = bank_name;
        this.ifsc_code = ifsc_code;
        this.gst_number = gst_number;
        this.email = email;
        this.bene_name = bene_name;
    }


    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getIfsc_code() {
        return ifsc_code;
    }

    public void setIfsc_code(String ifsc_code) {
        this.ifsc_code = ifsc_code;
    }

    public String getGst_number() {
        return gst_number;
    }

    public void setGst_number(String gst_number) {
        this.gst_number = gst_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBene_name() {
        return bene_name;
    }

    public void setBene_name(String bene_name) {
        this.bene_name = bene_name;
    }
}
