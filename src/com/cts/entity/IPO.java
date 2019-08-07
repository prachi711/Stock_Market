package com.cts.entity;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class IPO {
	@NotEmpty(message="Id can't be blank")
	private String id;
	private String company_name;
	private String stockExchange;
	private String pricePerShare;
	private String totalShares;
	
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private Date openDateTime;
	
	private String remarks;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public String getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(String pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public String getTotalShares() {
		return totalShares;
	}
	public void setTotalShares(String totalShares) {
		this.totalShares = totalShares;
	}
	public Date getOpenDateTime() {
		return openDateTime;
	}
	public void setOpenDateTime(Date openDateTime) {
		this.openDateTime = openDateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "IPO [id=" + id + ", company_name=" + company_name + ", stockExchange=" + stockExchange
				+ ", pricePerShare=" + pricePerShare + ", totalShares=" + totalShares + ", openDateTime=" + openDateTime
				+ ", remarks=" + remarks + "]";
	}
	
	
	

}
