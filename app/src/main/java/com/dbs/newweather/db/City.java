package com.dbs.newweather.db;

import org.litepal.crud.DataSupport;
import org.litepal.crud.LitePalSupport;

public class City extends LitePalSupport {

    private int id;
    private String cityName;
    private int citeCode;
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

    public int getCiteCode() {
        return citeCode;
    }

    public void setCiteCode(int citeCode) {
        this.citeCode = citeCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
