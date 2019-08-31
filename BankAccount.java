package com.zycus.model;
public class BankAccount {
	// attributes
	long accountId;
	String accountHolderName;
	String accountType;
	private double accountBalance;
	static long count;
	static long accountIdGenerator;
	static String bankName = "HDFC Bank";

	// Constructors
	public BankAccount() {
	}

	public BankAccount(String accountHolderName, String accountType, double accountBalance) {
		count++;
		this.accountId = ++accountIdGenerator;
		this.accountType = accountType;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}

	// methods
	public void withdraw(double amount) {
		accountBalance -= amount;
	}

	public void deposit(double amount) {
		accountBalance += amount;
	}

	public double getBalance() {
		return accountBalance;
	}

	public static long totalBankAccounts() {
		return count;
	}

	public void printBankAccountDetails() {
		System.out.println("===================================");
		System.out.println("Account ID : " + accountId);
		System.out.println("Account Holder Name : " + accountHolderName);
		System.out.println("Account Type : " + accountType);
		System.out.println("Account Balance : " + accountBalance);
		System.out.println("Bank Name : "+bankName);
	}

	// static block
	static {
		accountIdGenerator = 1000L;
	}
}
