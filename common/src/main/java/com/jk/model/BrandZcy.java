package com.jk.model;

import java.io.Serializable;

public class BrandZcy implements Serializable {
    private static final long serialVersionUID = 8714555482981957695L;
    private  Integer brandid;
    private  String brandname;

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }
}
