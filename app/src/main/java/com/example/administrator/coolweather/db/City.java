package com.example.administrator.coolweather.db;

import org.litepal.crud.DataSupport;

/*
* Author:   罗桂钊
* Date:     17/9/16
* Info:     City（市）类，对应city表
* 包含4个字段：id, cityName（市的名称）, cityCode（市的代号）,provinceId（隶属省的id）
* */

public class City extends DataSupport{
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
