package com.overseer.device;

public class MobileSpecificInformation {
	private String deviceId;
	private String hardwareId;
	private String simId;
	private String mobileApplication;
	private String phoneNumber;
	private String deviceModel;
	private String deviceName;
	private String operatingSystemId;
	private String operatingSystemVersion;
	private String locationAreaCode;
	private String cellTowerId;
	private int numberOfAddressBookEntries;
	private String wapClientId;
	private String carrierCode;
	private String countryCode;
	private DeviceInformation deviceInformation;

	public MobileSpecificInformation() {
	}

	public String getHardwareId() {
		return hardwareId;
	}

	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}

	public String getSimId() {
		return simId;
	}

	public void setSimId(String simId) {
		this.simId = simId;
	}

	public String getMobileApplication() {
		return mobileApplication;
	}

	public void setMobileApplication(String mobileApplication) {
		this.mobileApplication = mobileApplication;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDeviceModel() {
		return deviceModel;
	}

	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getOperatingSystemId() {
		return operatingSystemId;
	}

	public void setOperatingSystemId(String operatingSystemId) {
		this.operatingSystemId = operatingSystemId;
	}

	public String getOperatingSystemVersion() {
		return operatingSystemVersion;
	}

	public void setOperatingSystemVersion(String operatingSystemVersion) {
		this.operatingSystemVersion = operatingSystemVersion;
	}

	public String getLocationAreaCode() {
		return locationAreaCode;
	}

	public void setLocationAreaCode(String locationAreaCode) {
		this.locationAreaCode = locationAreaCode;
	}

	public String getCellTowerId() {
		return cellTowerId;
	}

	public void setCellTowerId(String cellTowerId) {
		this.cellTowerId = cellTowerId;
	}

	public int getNumberOfAddressBookEntries() {
		return numberOfAddressBookEntries;
	}

	public void setNumberOfAddressBookEntries(int numberOfAddressBookEntries) {
		this.numberOfAddressBookEntries = numberOfAddressBookEntries;
	}

	public String getWapClientId() {
		return wapClientId;
	}

	public void setWapClientId(String wapClientId) {
		this.wapClientId = wapClientId;
	}

	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public DeviceInformation getDeviceInformation() {
		return deviceInformation;
	}

	public void setDeviceInformation(DeviceInformation deviceInformation) {
		this.deviceInformation = deviceInformation;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

}
