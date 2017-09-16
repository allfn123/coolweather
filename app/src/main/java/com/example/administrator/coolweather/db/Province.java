package com.example.administrator.coolweather.db;

import org.litepal.crud.DataSupport;

/*
* Author:   罗桂钊
* Date:     17/9/16
* Info:     Province（省）类，对应province表
* 包含3个字段：id, provinceName（省的名称）, provinceCode（省的代号）
* */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
