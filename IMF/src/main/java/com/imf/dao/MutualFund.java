package com.imf.dao;

public class MutualFund {

	private String schemeName;
	private String schemeCode;
	private String isinDivPayout;
	private String isinDivReinvestment;
	private String netAssetValue;
	private String fundValueAsOfDate;
	private String dataLoadDate;
	
	public String getSchemeName() {
		return schemeName;
	}
	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}
	public String getSchemeCode() {
		return schemeCode;
	}
	public void setSchemeCode(String schemeCode) {
		this.schemeCode = schemeCode;
	}
	public String getIsinDivPayout() {
		return isinDivPayout;
	}
	public void setIsinDivPayout(String isinDivPayout) {
		this.isinDivPayout = isinDivPayout;
	}
	public String getIsinDivReinvestment() {
		return isinDivReinvestment;
	}
	public void setIsinDivReinvestment(String isinDivReinvestment) {
		this.isinDivReinvestment = isinDivReinvestment;
	}
	public String getNetAssetValue() {
		return netAssetValue;
	}
	public void setNetAssetValue(String netAssetValue) {
		this.netAssetValue = netAssetValue;
	}
	public String getFundValueAsOfDate() {
		return fundValueAsOfDate;
	}
	public void setFundValueAsOfDate(String fundValueAsOfDate) {
		this.fundValueAsOfDate = fundValueAsOfDate;
	}
	public String getDataLoadDate() {
		return dataLoadDate;
	}
	public void setDataLoadDate(String dataLoadDate) {
		this.dataLoadDate = dataLoadDate;
	}
	@Override
	public String toString() {
		return "MutualFund [schemeName=" + schemeName + ", schemeCode=" + schemeCode + ", isinDivPayout="
				+ isinDivPayout + ", isinDivReinvestment=" + isinDivReinvestment + ", netAssetValue=" + netAssetValue
				+ ", fundValueAsOfDate=" + fundValueAsOfDate + ", dataLoadDate=" + dataLoadDate + "]";
	}
	
}
