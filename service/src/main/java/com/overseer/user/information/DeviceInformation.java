package com.overseer.user.information;

import java.util.Date;

public class DeviceInformation {
	private String deviceId;
	private DeviceType deviceType;
	private Date createdTimestamp;
	private BrowserInformation browserInformation;
	private ScreenInformation screenInformation;
	private GeoLocation geoLocation;
	private WifiInformation wifiInformation;
	private String ipAddress;
	private MobileSpecificInformation mobileSpecificInformation;

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

	public BrowserInformation getBrowserInformation() {
		return browserInformation;
	}

	public void setBrowserInformation(BrowserInformation browserInformation) {
		this.browserInformation = browserInformation;
	}

	public ScreenInformation getScreenInformation() {
		return screenInformation;
	}

	public void setScreenInformation(ScreenInformation screenInformation) {
		this.screenInformation = screenInformation;
	}

	public GeoLocation getGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(GeoLocation geoLocation) {
		this.geoLocation = geoLocation;
	}

	public WifiInformation getWifiInformation() {
		return wifiInformation;
	}

	public void setWifiInformation(WifiInformation wifiInformation) {
		this.wifiInformation = wifiInformation;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public MobileSpecificInformation getMobileSpecificInformation() {
		return mobileSpecificInformation;
	}

	public void setMobileSpecificInformation(MobileSpecificInformation mobileSpecificInformation) {
		this.mobileSpecificInformation = mobileSpecificInformation;
	}

	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

}
