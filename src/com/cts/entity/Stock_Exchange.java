package com.cts.entity;

import org.hibernate.validator.constraints.NotEmpty;

public class Stock_Exchange {
	@NotEmpty
	private String stockId;
	private String stockExchange;
	private String brief;
	private String contactAddress;
	private String remarks;
	
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "Stock_Exchange [stockId=" + stockId + ", stockExchange=" + stockExchange + ", brief=" + brief
				+ ", contactAddress=" + contactAddress + ", remarks=" + remarks + "]";
	}
	
	
	

}
