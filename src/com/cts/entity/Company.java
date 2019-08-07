package com.cts.entity;

import org.hibernate.validator.constraints.NotEmpty;

public class Company {
	@NotEmpty(message="Specify Company name")
	private String companyName;
	
	private long turnover;
	private String CEO;
	private String boardOfDirectors;
	private String listedInStackExchange;
	private String sector;
	private String briefWriteUp;
	private String stockCode_InStockExchange;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public long getTurnover() {
		return turnover;
	}
	public void setTurnover(long turnover) {
		this.turnover = turnover;
	}
	public String getCEO() {
		return CEO;
	}
	public void setCEO(String cEO) {
		CEO = cEO;
	}
	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	public String getListedInStackExchange() {
		return listedInStackExchange;
	}
	public void setListedInStackExchange(String listedInStackExchange) {
		this.listedInStackExchange = listedInStackExchange;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getBriefWriteUp() {
		return briefWriteUp;
	}
	public void setBriefWriteUp(String briefWriteUp) {
		this.briefWriteUp = briefWriteUp;
	}
	public String getStockCode_InStockExchange() {
		return stockCode_InStockExchange;
	}
	public void setStockCode_InStockExchange(String stockCode_InStockExchange) {
		this.stockCode_InStockExchange = stockCode_InStockExchange;
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", turnover=" + turnover + ", CEO=" + CEO + ", boardOfDirectors="
				+ boardOfDirectors + ", listedInStackExchange=" + listedInStackExchange + ", sector=" + sector
				+ ", briefWriteUp=" + briefWriteUp + ", stockCode_InStockExchange=" + stockCode_InStockExchange + "]";
	}
	
	
	
	

}
