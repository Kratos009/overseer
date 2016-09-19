package com.overseer.device;

import java.io.Serializable;

public class BrowserMimeTypeInformation implements Serializable {
	private static final long serialVersionUID = -1147925103625576846L;
	private long id;
	private String name;
	private String description;
	private String suffixListPipeSeperated;
	
	public BrowserMimeTypeInformation() {
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

	public String getSuffixListPipeSeperated() {
		return suffixListPipeSeperated;
	}

	public void setSuffixListPipeSeperated(String suffixListPipeSeperated) {
		this.suffixListPipeSeperated = suffixListPipeSeperated;
	}


}
