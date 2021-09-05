package com.bridgelabz.commercialdata;
import java.util.*;
import My
import java.time.LocalDateTime;
public class StockAccount {
	private String fileName;
	LinkedList<CompanyShares> companyShares;
	
	public StockAccount(String fileName) {
		this.fileName=fileName;
		companyShares=new LinkedList<>();
	}
	
	public double valueOf() {
		return 0;
	}
	
	public void addCompanyShares(CompanyShares Shares) {
        companyShares.add(Shares);
    } 
	
	public void buy(int amount, String symbol) {
		for(CompanyShares share: companyShares ) {
			if(share.getSymbol().equals(symbol)) {
				int existingAmount=share.getNoOfShares();
				share.setNoOfShares(amount+existingAmount);
				return;
			}
		}
		
		CompanyShares newShare=new CompanyShares(symbol, amount, LocalDateTime.now());
		companyShares.add(newShare);
		
		
	}
	
	public void sell(int amount, String symbol) {
		for(CompanyShares share: companyShares ) {
			if(share.getSymbol().equals(symbol)) {
				int existingAmount=share.getNoOfShares();
				share.setNoOfShares(existingAmount-amount);
				return;
			}
		}
		System.out.println("Symbol Not found");
		
	}
	
	public void printReport() {
		System.out.println(fileName);
		for(CompanyShares share: companyShares) {
			System.out.println("Symbol: "+share.getSymbol());
			System.out.println("No of shares: "+share.getNoOfShares());
			System.out.println("date and time: "+ share.getDatetime());
		}
		
	}
	

}
