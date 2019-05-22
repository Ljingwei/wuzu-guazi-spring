package com.jk.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection="t_car")
public class CarBean implements Serializable{
    private Integer carid;
    private Integer brandid;//品牌id
    private String brandname;
    private Integer seriesid;//车系id
    private String seriesname;
    private Integer yeartypeid;//哪一年的款id
    private String year;
    private Integer sptimeid; //上牌时间id;
    private Integer plataid; //牌照地id
    private String displacement;//排量id
    private Integer transmissionid;//变速箱id
    private String transmissionname;
    private Integer modelsid;//车型id
    private String modelname;
    private Integer smissiontypeid;//排放标准id
    private Integer seattypeid; //座位数id
    private Integer fueltypeid;//燃油类型id
    private Integer colorid;//颜色id
    private Integer driveid;//驱动类型id
    private Integer countryid;//国别id
    private Integer configurationid;//亮点配置id
    private Integer gztype;//在瓜子中说的类型（
    private Integer userphone;//车主电话
    private Integer username;//车主姓名
    private Integer mileage;//里程数
    private Integer carareaid;//车源地id
    private Integer price;//价格
    private String  imgid;//图片id
    private String img;
     private String labelid;//标签
     private String labelname;

    public String getTransmissionname() {
        return transmissionname;
    }

    public void setTransmissionname(String transmissionname) {
        this.transmissionname = transmissionname;
    }

    public String getLabelid() {
        return labelid;
    }

    public void setLabelid(String labelid) {
        this.labelid = labelid;
    }

    public String getLabelname() {
        return labelname;
    }

    public void setLabelname(String labelname) {
        this.labelname = labelname;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public String getSeriesname() {
        return seriesname;
    }

    public void setSeriesname(String seriesname) {
        this.seriesname = seriesname;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public String getImgid() {
        return imgid;
    }

    public void setImgid(String imgid) {
        this.imgid = imgid;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getCarid() {
        return carid;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
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

    public Integer getUsername() {
        return username;
    }

    public void setUsername(Integer username) {
        this.username = username;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getCarareaid() {
        return carareaid;
    }

    public void setCarareaid(Integer carareaid) {
        this.carareaid = carareaid;
    }
}
