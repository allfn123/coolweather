package com.example.administrator.coolweather.db;

import org.litepal.crud.DataSupport;

/*
* Author:   罗桂钊
* Date:     17/9/16
* Info:     County（县）类，对应county表
* 包含3个字段：id, countyName（县的名称）, weatherId（天气id）,cityId（隶属市的id）
* */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
