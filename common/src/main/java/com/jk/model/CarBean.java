package com.jk.model;

import java.io.Serializable;

/**
 * @Author 王鹏焱
 * @Date 2019/5/16 21:36
 */

public class CarBean implements Serializable {

	private static final long serialVersionUID = 8590369361430709245L;
	private  Integer brandid;//品牌id
	private  Integer seriesid;//车系id
	private  Integer yeartypeid;//哪一年的款id
	private  Integer  sptimeid;//上牌时间id
	private  Integer  plataid;//牌照地id
	private  Integer  displacementid;//排量id
	private  Integer  transmissionid;//变速箱id
	private  String   chekuang;//车况信息
	private  Integer  modelsid;//车型id
	private  Integer  smissiontypeid;//排放标准id
	private  Integer  seattypeid;//座位数id
	private  Integer  fueltypeid;//燃油类型id
	private  Integer  colorid;//颜色id
	private  Integer   driveid;//驱动类型id
	private  Integer   countryid; //国别id
	private  Integer  configurationid;//亮点配置id
	private  Integer  gztype;//在瓜子中说的类型（-1为严选型）
	private  String  userphone;//车主电话
	private  String  username;//车主姓名
	private Integer mileage;
	private String yanchetime;
	private String yanchedz;
	private Integer sptimemonthid;

	public Integer getMileage() {
		return mileage;
	}

	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}

	public Integer getSptimemonthid() {
		return sptimemonthid;
	}

	public void setSptimemonthid(Integer sptimemonthid) {
		this.sptimemonthid = sptimemonthid;
	}

	public String getChekuang() {
		return chekuang;
	}

	public void setChekuang(String chekuang) {
		this.chekuang = chekuang;
	}

	public String getYanchetime() {
		return yanchetime;
	}

	public void setYanchetime(String yanchetime) {
		this.yanchetime = yanchetime;
	}

	public String getYanchedz() {
		return yanchedz;
	}

	public void setYanchedz(String yanchedz) {
		this.yanchedz = yanchedz;
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

	public Integer getDisplacementid() {
		return displacementid;
	}

	public void setDisplacementid(Integer displacementid) {
		this.displacementid = displacementid;
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

	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "CarBean{" +
				"brandid=" + brandid +
				", seriesid=" + seriesid +
				", yeartypeid=" + yeartypeid +
				", sptimeid=" + sptimeid +
				", plataid=" + plataid +
				", displacementid=" + displacementid +
				", transmissionid=" + transmissionid +
				", modelsid=" + modelsid +
				", smissiontypeid=" + smissiontypeid +
				", seattypeid=" + seattypeid +
				", fueltypeid=" + fueltypeid +
				", colorid=" + colorid +
				", driveid=" + driveid +
				", countryid=" + countryid +
				", configurationid=" + configurationid +
				", gztype=" + gztype +
				", userphone='" + userphone + '\'' +
				", username='" + username + '\'' +
				'}';
	}
}
