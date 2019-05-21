package com.jk.model;

public class CarBeanYw {

    private Integer carid;   //主键车ID ---------------

    private Integer brandid;  // 品牌id

    private String brandname;  // +++++++++++++++++++

    private Integer seriesid;   //车系id

    private Integer yeartypeid; //哪一年的款id

    private String yeartypename;  // +++++++++++++++++++

    private Integer sptimeid;  // 上牌时间id

    private Integer plataid;   //牌照地id

    private String displacement;  // 排量，为varchar类型---------------

    private Integer transmissionid;  // 变速箱id

    private String transmissionname;   // +++++++++++++++++++

    private Integer modelsid;  // 车型id

    private Integer smissiontypeid;  // 排放标准id

    private Integer seattypeid;   //座位数id

    private Integer fueltypeid;  //燃油类型id

    private Integer colorid;  // 颜色id

    private Integer driveid;   // 驱动类型id

    private Integer countryid;  // 国别id

    private Integer configurationid;  //亮点配置id

    private Integer gztype;   // 在瓜子中说的类型（-1为严选型)------------------

    private Integer userphone;  //车主电话  ------------------

    private String username;   //车主姓名  ------------------

    private Integer price;    // 价格为int类型，以万为单位  ------------------

    private String mileage;  // 里程数 以万为单位 varchar类型 ------------------

    private Double km;   // 公里 --------------------------



    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public Integer getSeriesid() {
        return seriesid;
    }

    public void setSeriesid(Integer seriesid) {
        this.seriesid = seriesid;
    }

    public Integer getYeartypeid() {
        return yeartypeid;
    }

    public void setYeartypeid(Integer yeartypeid) {
        this.yeartypeid = yeartypeid;
    }

    public Integer getSptimeid() {
        return sptimeid;
    }

    public void setSptimeid(Integer sptimeid) {
        this.sptimeid = sptimeid;
    }

    public Integer getPlataid() {
        return plataid;
    }

    public void setPlataid(Integer plataid) {
        this.plataid = plataid;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public Integer getTransmissionid() {
        return transmissionid;
    }

    public void setTransmissionid(Integer transmissionid) {
        this.transmissionid = transmissionid;
    }

    public Integer getModelsid() {
        return modelsid;
    }

    public void setModelsid(Integer modelsid) {
        this.modelsid = modelsid;
    }

    public Integer getSmissiontypeid() {
        return smissiontypeid;
    }

    public void setSmissiontypeid(Integer smissiontypeid) {
        this.smissiontypeid = smissiontypeid;
    }

    public Integer getSeattypeid() {
        return seattypeid;
    }

    public void setSeattypeid(Integer seattypeid) {
        this.seattypeid = seattypeid;
    }

    public Integer getFueltypeid() {
        return fueltypeid;
    }

    public void setFueltypeid(Integer fueltypeid) {
        this.fueltypeid = fueltypeid;
    }

    public Integer getColorid() {
        return colorid;
    }

    public void setColorid(Integer colorid) {
        this.colorid = colorid;
    }

    public Integer getDriveid() {
        return driveid;
    }

    public void setDriveid(Integer driveid) {
        this.driveid = driveid;
    }

    public Integer getCountryid() {
        return countryid;
    }

    public void setCountryid(Integer countryid) {
        this.countryid = countryid;
    }

    public Integer getConfigurationid() {
        return configurationid;
    }

    public void setConfigurationid(Integer configurationid) {
        this.configurationid = configurationid;
    }

    public Integer getGztype() {
        return gztype;
    }

    public void setGztype(Integer gztype) {
        this.gztype = gztype;
    }

    public Integer getUserphone() {
        return userphone;
    }

    public void setUserphone(Integer userphone) {
        this.userphone = userphone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public Double getKm() {
        return km;
    }

    public void setKm(Double km) {
        this.km = km;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public String getYeartypename() {
        return yeartypename;
    }

    public void setYeartypename(String yeartypename) {
        this.yeartypename = yeartypename;
    }

    public String getTransmissionname() {
        return transmissionname;
    }

    public void setTransmissionname(String transmissionname) {
        this.transmissionname = transmissionname;
    }

    @Override
    public String toString() {
        return "CarBeanYw{" +
                "carid=" + carid +
                ", brandid=" + brandid +
                ", brandname='" + brandname + '\'' +
                ", seriesid=" + seriesid +
                ", yeartypeid=" + yeartypeid +
                ", yeartypename='" + yeartypename + '\'' +
                ", sptimeid=" + sptimeid +
                ", plataid=" + plataid +
                ", displacement='" + displacement + '\'' +
                ", transmissionid=" + transmissionid +
                ", transmissionname='" + transmissionname + '\'' +
                ", modelsid=" + modelsid +
                ", smissiontypeid=" + smissiontypeid +
                ", seattypeid=" + seattypeid +
                ", fueltypeid=" + fueltypeid +
                ", colorid=" + colorid +
                ", driveid=" + driveid +
                ", countryid=" + countryid +
                ", configurationid=" + configurationid +
                ", gztype=" + gztype +
                ", userphone=" + userphone +
                ", username='" + username + '\'' +
                ", price=" + price +
                ", mileage='" + mileage + '\'' +
                ", km=" + km +
                '}';
    }
}
