package com.cts.entity;

import org.hibernate.validator.constraints.NotEmpty;

//import org.springframework.format.annotation.DateTimeFormat;

public class Sector {
	
	@NotEmpty
	private String sectorId;
	private String sectorName;
	private String brief;
	
	public String getSectorId() {
		return sectorId;
	}
	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
	}
	public String getSectorName() {
		return sectorName;
	}
	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	@Override
	public String toString() {
		return "Sector [sectorId=" + sectorId + ", sectorName=" + sectorName + ", brief=" + brief + "]";
	}
	
	
	
	
	

}
