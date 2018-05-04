package com.coolweather.zhang.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zhang on 2018/5/4.
 */

public class Province extends DataSupport {

    private int id;
    private String provincaName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvincaName() {
        return provincaName;
    }

    public void setProvincaName(String provincaName) {
        this.provincaName = provincaName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
