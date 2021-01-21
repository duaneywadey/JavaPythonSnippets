package ooppractice;

import java.util.Scanner;

public class bankSystem {
	static int balance;
	int withdrawal;
	int deposit;
	String accountName;
	

	public bankSystem(String accountName, int balance) {
		this.accountName = accountName;
		this.balance = 200000;
	}

	public static int showBalance(int balance) {
		System.out.println(balance);
		return balance;	
	}
	public int withdrawMoney(int balance, int withdrawal) {
		balance-=withdrawal;
		if (balance < withdrawal) {
			System.out.println("Too high!");
		}
		System.out.println("Withdrawn money: " + withdrawal);
		System.out.println("Current balance: " + balance);
		return balance;
	}
	public int depositMoney(int balance, int deposit) {
		balance+=deposit;
		System.out.println("Added to balance: " + deposit);
		System.out.println("Current balance: " + balance);
		return balance;
	}
	public static void main(String[] args) {
		bankSystem josh = new bankSystem("Josh", balance );
		josh.showBalance(200000);
		josh.depositMoney(balance, 40293);
		josh.withdrawMoney(balance, 12);
		
		
		
		
		
		
		
			
		}

	}


