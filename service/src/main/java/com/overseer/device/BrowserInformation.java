package com.overseer.device;

import java.util.Set;

public class BrowserInformation {
	private String browserId;
	private String canvasFingerprint;
	private String name;
	private int majorVersion;
	private int minorVersion;
	private String userAgent;
	private String httpAccept;
	private String httpAcceptChars;
	private String httpAcceptEncoding;
	private String httpAcceptLanguage;
	private String httpReferer;
	private int ecmaScriptVersion;
	private String fontListPipeSeperated;
	private Set<BrowserPluginInformation> plugins;
	private Set<BrowserMimeTypeInformation> mimeTypes;

	public BrowserInformation() {
	}

	public String getBrowserId() {
		return browserId;
	}

	public void setBrowserId(String browserId) {
		this.browserId = browserId;
	}

	public String getCanvasFingerprint() {
		return canvasFingerprint;
	}

	public void setCanvasFingerprint(String canvasFingerprint) {
		this.canvasFingerprint = canvasFingerprint;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMajorVersion() {
		return majorVersion;
	}

	public void setMajorVersion(int majorVersion) {
		this.majorVersion = majorVersion;
	}

	public int getMinorVersion() {
		return minorVersion;
	}

	public void setMinorVersion(int minorVersion) {
		this.minorVersion = minorVersion;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getHttpAccept() {
		return httpAccept;
	}

	public void setHttpAccept(String httpAccept) {
		this.httpAccept = httpAccept;
	}

	public String getHttpAcceptChars() {
		return httpAcceptChars;
	}

	public void setHttpAcceptChars(String httpAcceptChars) {
		this.httpAcceptChars = httpAcceptChars;
	}

	public String getHttpAcceptEncoding() {
		return httpAcceptEncoding;
	}

	public void setHttpAcceptEncoding(String httpAcceptEncoding) {
		this.httpAcceptEncoding = httpAcceptEncoding;
	}

	public String getHttpAcceptLanguage() {
		return httpAcceptLanguage;
	}

	public void setHttpAcceptLanguage(String httpAcceptLanguage) {
		this.httpAcceptLanguage = httpAcceptLanguage;
	}

	public String getHttpReferer() {
		return httpReferer;
	}

	public void setHttpReferer(String httpReferer) {
		this.httpReferer = httpReferer;
	}

	public int getEcmaScriptVersion() {
		return ecmaScriptVersion;
	}

	public void setEcmaScriptVersion(int ecmaScriptVersion) {
		this.ecmaScriptVersion = ecmaScriptVersion;
	}

	public String getFontListPipeSeperated() {
		return fontListPipeSeperated;
	}

	public void setFontListPipeSeperated(String fontListPipeSeperated) {
		this.fontListPipeSeperated = fontListPipeSeperated;
	}

	public Set<BrowserPluginInformation> getPlugins() {
		return plugins;
	}

	public void setPlugins(Set<BrowserPluginInformation> plugins) {
		this.plugins = plugins;
	}

	public Set<BrowserMimeTypeInformation> getMimeTypes() {
		return mimeTypes;
	}

	public void setMimeTypes(Set<BrowserMimeTypeInformation> mimeTypes) {
		this.mimeTypes = mimeTypes;
	}


}
