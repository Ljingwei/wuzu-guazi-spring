package com.jk.model;

import java.io.Serializable;

public class CarareaZcy implements Serializable {

    private static final long serialVersionUID = 8597323799339833700L;
    private  Integer id;
    private  String province_name;
    private  Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince_name() {
        return province_name;
    }

    public void setProvince_name(String province_name) {
        this.province_name = province_name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
