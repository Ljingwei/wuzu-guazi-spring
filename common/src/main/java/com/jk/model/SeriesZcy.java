package com.jk.model;

import java.io.Serializable;

public class SeriesZcy implements Serializable {

    private static final long serialVersionUID = 5586295210849766296L;
    private Integer seriesid;
    private String seriesname;
    private  Integer brandid;

    public Integer getSeriesid() {
        return seriesid;
    }

    public void setSeriesid(Integer seriesid) {
        this.seriesid = seriesid;
    }

    public String getSeriesname() {
        return seriesname;
    }

    public void setSeriesname(String seriesname) {
        this.seriesname = seriesname;
    }

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }
}
