package com.overseer.user.information;

import java.util.List;

public class BrowserInformation {
	private String name;
	private String majorVersion;
	private String userAgent;
	private List<BrowserPluginInformation> plugins;
	private List<BrowserMimeTypeInformation> mimeTypes;
	private String httpAccept;
	private String httpAcceptChars;
	private String httpAcceptEncoding;
	private String httpAcceptLanguage;
	private String httpReferer;
	private String ecmaScriptVersion;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajorVersion() {
		return majorVersion;
	}

	public void setMajorVersion(String majorVersion) {
		this.majorVersion = majorVersion;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public List<BrowserPluginInformation> getPlugins() {
		return plugins;
	}

	public void setPlugins(List<BrowserPluginInformation> plugins) {
		this.plugins = plugins;
	}

	public List<BrowserMimeTypeInformation> getMimeTypes() {
		return mimeTypes;
	}

	public void setMimeTypes(List<BrowserMimeTypeInformation> mimeTypes) {
		this.mimeTypes = mimeTypes;
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

	public String getEcmaScriptVersion() {
		return ecmaScriptVersion;
	}

	public void setEcmaScriptVersion(String ecmaScriptVersion) {
		this.ecmaScriptVersion = ecmaScriptVersion;
	}

}
