package com.jk.model;

import java.io.Serializable;

public class SptimeYearZcy implements Serializable {

    private static final long serialVersionUID = 6852786910871258323L;
    private  Integer sptimeid;
    private  String  sptime;
    private   Integer sptimepid;

    public Integer getSptimeid() {
        return sptimeid;
    }

    public void setSptimeid(Integer sptimeid) {
        this.sptimeid = sptimeid;
    }

    public String getSptime() {
        return sptime;
    }

    public void setSptime(String sptime) {
        this.sptime = sptime;
    }

    public Integer getSptimepid() {
        return sptimepid;
    }

    public void setSptimepid(Integer sptimepid) {
        this.sptimepid = sptimepid;
    }
}
