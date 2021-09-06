package com.bridgelabz.commercialdata;

import java.time.LocalDateTime;

public class CommercialDataMain {

	public static void main(String[] args) {
		StockAccount account=new StockAccount("NewAccount");
		CompanyShares reliance=new CompanyShares("reliance", 20, LocalDateTime.now());
		account.addCompanyShares(reliance);
		CompanyShares tata=new CompanyShares("tata", 50, LocalDateTime.now());
		account.addCompanyShares(tata);
		account.printReport();
		account.buy(10,"reliance");
		account.sell(10, "tata");
		account.printReport();
		
	}

}
