package com.overseer.user.information;

import java.util.List;

public class BrowserMimeTypeInformation {
	private String type;
	private String description;
	private List<String> suffixList;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getSuffixList() {
		return suffixList;
	}

	public void setSuffixList(List<String> suffixList) {
		this.suffixList = suffixList;
	}

}
