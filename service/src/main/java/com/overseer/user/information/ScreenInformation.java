package com.overseer.user.information;

public class ScreenInformation {
	private int height;
	private int width;
	private int colorDepth;
	private int pixelDepth;
	private ScreenOrientationType screenOrientationType;
	private int screenOrientationAngle;

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

}
