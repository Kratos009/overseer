package com.overseer.device;

import java.util.Date;
import java.util.Set;

public class DeviceInformation {
	private String deviceId;
	private DeviceType deviceType;
	private String operatingSystem;
	private Date createdTimestamp;
	private Date lastUpdatedTimestamp;
	private Set<BrowserInformation> browsers;
	private ScreenInformation screenInformation;
	private MobileSpecificInformation mobileSpecificInformation;

	public DeviceInformation() {
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public DeviceType getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(DeviceType deviceType) {
		this.deviceType = deviceType;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public Date getLastUpdatedTimestamp() {
		return lastUpdatedTimestamp;
	}

	public void setLastUpdatedTimestamp(Date lastUpdatedTimestamp) {
		this.lastUpdatedTimestamp = lastUpdatedTimestamp;
	}

	public Set<BrowserInformation> getBrowsers() {
		return browsers;
	}

	public void setBrowsers(Set<BrowserInformation> browsers) {
		this.browsers = browsers;
	}

	public ScreenInformation getScreenInformation() {
		return screenInformation;
	}

	public void setScreenInformation(ScreenInformation screenInformation) {
		this.screenInformation = screenInformation;
	}

	public MobileSpecificInformation getMobileSpecificInformation() {
		return mobileSpecificInformation;
	}

	public void setMobileSpecificInformation(MobileSpecificInformation mobileSpecificInformation) {
		this.mobileSpecificInformation = mobileSpecificInformation;
	}

}
