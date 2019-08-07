package com.cts.entity;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Stock {
	@NotEmpty
	private String companyCode;
	private String stockExchange;
	private long currentPrice;
	
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private Date date;
	private String time;
	
	
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public long getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(long currentPrice) {
		this.currentPrice = currentPrice;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Stock [companyCode=" + companyCode + ", stockExchange=" + stockExchange + ", currentPrice="
				+ currentPrice + ", date=" + date + ", time=" + time + "]";
	}
	
	
	

}
