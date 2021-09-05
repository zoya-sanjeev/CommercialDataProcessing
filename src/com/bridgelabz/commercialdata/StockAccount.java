package com.bridgelabz.commercialdata;

import java.util.*;

public class StockAccount {
	private String fileName;
	List<CompanyShares> companyShares;
	
	public StockAccount(String fileName) {
		this.fileName=fileName;
		companyShares=new ArrayList<>();
	}
	
	public double valueOf() {
		return 0;
	}
	
	void buy(int amount, String symbol) {
		for(CompanyShares share: companyShares ) {
			if(share.getSymbol().equals(symbol)) {
				int existingAmount=share.getNoOfShares();
				share.setNoOfShares(amount+existingAmount);
				return;
			}
		}
		System.out.println("Symbol Not found");
	}
	
	void sell(int amount, String symbol) {
		for(CompanyShares share: companyShares ) {
			if(share.getSymbol().equals(symbol)) {
				int existingAmount=share.getNoOfShares();
				share.setNoOfShares(existingAmount-amount);
				return;
			}
		}
		System.out.println("Symbol Not found");
		
	}
	

}
