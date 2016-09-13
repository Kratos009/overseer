package com.overseer.user.information;

public class PhoneNumber {
	private String countryCode;
	private String nationalIdentificationNumber;
	private PhoneNumberCategory phoneNumberCategory;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getNationalIdentificationNumber() {
		return nationalIdentificationNumber;
	}

	public void setNationalIdentificationNumber(String nationalIdentificationNumber) {
		this.nationalIdentificationNumber = nationalIdentificationNumber;
	}

	public PhoneNumberCategory getPhoneNumberCategory() {
		return phoneNumberCategory;
	}

	public void setPhoneNumberCategory(PhoneNumberCategory phoneNumberCategory) {
		this.phoneNumberCategory = phoneNumberCategory;
	}

}
