package com.zycus.client;
import com.zycus.model.BankAccount;
public class TestBankAccount {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount("John Conner", "Saving", 45000);
		BankAccount account2=new BankAccount("Alex Browning","Current",125000);
		System.out.println("Total number of bank accounts : " + BankAccount.totalBankAccounts());
		account1.printBankAccountDetails();
		account1.printBankAccountDetails();
		System.out.println("Before Transaction : account balance : "+account1.getBalance());
		account1.withdraw(5000);
		System.out.println("Before Transaction : account balance : "+account1.getBalance());
		System.out.println("=========================");
		System.out.println("Before Transaction : account balance : "+account2.getBalance());
		account2.deposit(5000);
		System.out.println("Before Transaction : account balance : "+account2.getBalance());
	}

}
