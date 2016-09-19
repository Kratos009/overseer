package com.overseer.device;

import java.io.Serializable;

public class BrowserPluginInformation implements Serializable {

	private static final long serialVersionUID = 6982338390518430100L;
	private long id;
	private String name;
	private String description;
	private String version;

	public BrowserPluginInformation() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}


}
