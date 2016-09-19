package com.overseer.device;

public class ScreenInformation {
	private String deviceId;
	private int height;
	private int width;
	private int colorDepth;
	private int pixelDepth;
	private ScreenOrientationType screenOrientationType;
	private int screenOrientationAngle;
	private DeviceInformation deviceInformation;

	public ScreenInformation() {
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getColorDepth() {
		return colorDepth;
	}

	public void setColorDepth(int colorDepth) {
		this.colorDepth = colorDepth;
	}

	public int getPixelDepth() {
		return pixelDepth;
	}

	public void setPixelDepth(int pixelDepth) {
		this.pixelDepth = pixelDepth;
	}

	public ScreenOrientationType getScreenOrientationType() {
		return screenOrientationType;
	}

	public void setScreenOrientationType(ScreenOrientationType screenOrientationType) {
		this.screenOrientationType = screenOrientationType;
	}

	public int getScreenOrientationAngle() {
		return screenOrientationAngle;
	}

	public void setScreenOrientationAngle(int screenOrientationAngle) {
		this.screenOrientationAngle = screenOrientationAngle;
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
