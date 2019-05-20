package com.jk.model;

import java.io.Serializable;

public class SptimeMonthZcy implements Serializable {
    private static final long serialVersionUID = -8233228415137049881L;
    private Integer id;
    private Integer month;
    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
