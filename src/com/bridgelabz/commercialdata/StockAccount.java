package com.bridgelabz.commercialdata;

import java.util.*;

public class StockAccount {
	private String fileName;
	List<CompanyShares> companyShares;
	
	public StockAccount(String fileName) {
		this.fileName=fileName;
		companyShares=new ArrayList<>();
	}
	

}
