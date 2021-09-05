package com.bridgelabz.commercialdata;

import java.time.LocalDateTime;

public class CompanyShares {
	
	private String symbol;
	private int noOfShares;
	private LocalDateTime datetime;
	
	public CompanyShares(String symbol,int noOfShares,LocalDateTime datetime) {
		this.symbol=symbol;
		this.noOfShares=noOfShares;
		this.datetime=datetime;
		
	}
	
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getNoOfShares() {
		return noOfShares;
	}

	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}


}
