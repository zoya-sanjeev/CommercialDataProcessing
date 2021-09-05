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

}
