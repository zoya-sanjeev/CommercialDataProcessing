package com.bridgelabz.commercialdata;
import java.util.*;
import com.bridgelabz.stacksandqueues.MyStack;
import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.LinkedList;
import com.bridgelabz.linkedlist.MyNode;

import java.time.LocalDateTime;
public class StockAccount {
	private String fileName;
	LinkedList<CompanyShares> companyShares;
	
	private Stack<String> buyStack;
	private Stack<String> sellStack;
	private Queue<LocalDateTime> buyTime;
	private Queue<LocalDateTime> sellTime;
	
	public StockAccount(String fileName) {
		this.fileName=fileName;
		companyShares=new LinkedList<>();
	}
	
	public double valueOf() {
		return 0;
	}
	
	public void addCompanyShares(CompanyShares Shares) {
		MyNode newNode=new MyNode(Shares);
        companyShares.add((INode) Shares);
    } 
	
	public void buy(int amount, String symbol) {
		MyNode tempNode=(MyNode) companyShares.getHead();
		while(tempNode!=null) {
			CompanyShares share=(CompanyShares) tempNode.getKey();
			if(share.getSymbol().equals(symbol)) {
				int existingAmount=share.getNoOfShares();
				share.setNoOfShares(amount+existingAmount);
				return;
			}
			
		}
		
		CompanyShares newShare=new CompanyShares(symbol, amount, LocalDateTime.now());
		companyShares.add(new MyNode(newShare));
		buyStack.push(symbol);
		buyTime.add(LocalDateTime.now());
		
		
	}
	
	public void sell(int amount, String symbol) {
		MyNode tempNode=(MyNode) companyShares.getHead();
		while(tempNode!=null) {
			CompanyShares share=(CompanyShares) tempNode.getKey();
			if(share.getSymbol().equals(symbol)) {
				int existingAmount=share.getNoOfShares();
				share.setNoOfShares(existingAmount-amount);
				sellStack.push(symbol);
				sellTime.add(LocalDateTime.now());
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
