package com.overseer.user.information;

import java.util.Date;

public class Address {
	private String line1;
	private String line2;
	private String line3;
	private String postal;
	private String province;
	private String city;
	private String state;
	private String country;
	private int zipCode;
	private int zipPlus4;
	private String attentionLine1;
	private String attentionLine2;
	private AddressCategory addressCategory;
	private Date effectiveDate;
	private Date updatedDate;
	private Date terminationDate;

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getLine3() {
		return line3;
	}

	public void setLine3(String line3) {
		this.line3 = line3;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public int getZipPlus4() {
		return zipPlus4;
	}

	public void setZipPlus4(int zipPlus4) {
		this.zipPlus4 = zipPlus4;
	}

	public String getAttentionLine1() {
		return attentionLine1;
	}

	public void setAttentionLine1(String attentionLine1) {
		this.attentionLine1 = attentionLine1;
	}

	public String getAttentionLine2() {
		return attentionLine2;
	}

	public void setAttentionLine2(String attentionLine2) {
		this.attentionLine2 = attentionLine2;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Date getTerminationDate() {
		return terminationDate;
	}

	public void setTerminationDate(Date terminationDate) {
		this.terminationDate = terminationDate;
	}

	public AddressCategory getAddressCategory() {
		return addressCategory;
	}

	public void setAddressCategory(AddressCategory addressCategory) {
		this.addressCategory = addressCategory;
	}

}
