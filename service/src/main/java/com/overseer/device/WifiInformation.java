package com.overseer.device;

public class WifiInformation {

	// The Wi-Fi card mac address
	private String macAddress;

	// The Wi-Fi station name. This element not supported by IOS.
	private String stationName;

	// The basic service set identifier(bssid). The element not supported by
	// IOS.
	private String bssId;

	// The wireless signal strength. The element not supported by IOS.
	private double signalStrength;

	// The Wi-Fi band is divided into multiple channels, each with different
	// frequencies
	// The element defines which channel is currently being used by the wi-fi
	// connection
	// The element not supported by IOS
	private String dataChannel;

	// The service set identifier (SSID). The element not supported by IOS.
	private String ssid;

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getBssId() {
		return bssId;
	}

	public void setBssId(String bssId) {
		this.bssId = bssId;
	}

	public double getSignalStrength() {
		return signalStrength;
	}

	public void setSignalStrength(double signalStrength) {
		this.signalStrength = signalStrength;
	}

	public String getDataChannel() {
		return dataChannel;
	}

	public void setDataChannel(String dataChannel) {
		this.dataChannel = dataChannel;
	}

	public String getSsid() {
		return ssid;
	}

	public void setSsid(String ssid) {
		this.ssid = ssid;
	}

}
