package com.training.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.training.Account;
import com.training.Bank;

import edu.emory.mathcs.backport.java.util.Arrays;
import junit.framework.Assert;

class BankTest {

	Bank bank;
	Account account1;
	Account account2;
	Account account3;
	Account account4;
	Account account5;
	
	
	@BeforeEach
	void setUp() throws Exception {
		bank = new Bank();
		account1 = new Account("testname1", 12345, 6000);
		account2 = new Account("testname2", 54321, 12000);
		account3 = new Account("testname3", 78965, 5000);
		account4 = new Account("testname4", 12345, 8000);
		account5 = new Account("testname5", 78541, 7000);
		
		
		ArrayList<Account> accountList = new ArrayList<Account>();
		
	}

	@Test
	void testAddNewAccount() {
	
		bank.addNewAccount(account1);
		bank.addNewAccount(account2);
		
		int size = bank.getAccounts().size();
		
		Assert.assertEquals(2, size);
		
		bank.addNewAccount(account3);
		Assert.assertEquals(3, bank.getAccounts().size());
		
	}

	@Test
	void testDepositAmount() {
		int balance = account1.getBalance();
		//account1.depositAmount(1000);
		
		bank.addNewAccount(account1);
	   Account temp=bank.depositAmount("testname1", 12345, 1000);
		
		Assert.assertEquals(balance+1000, temp.getBalance());
		
	}

	@Test
	void testWithdrawAmount() {
		int balance = account2.getBalance();
		//account1.depositAmount(1000);
		
		bank.addNewAccount(account2);
	   Account temp=bank.withdrawAmount("testname2", 54321, 1000);
		
		Assert.assertEquals(balance-1000, temp.getBalance());
		
	}

	@Test
	void testTransferBetweenAccounts() {
		int balance2 = account2.getBalance();
		
		int balance3 = account3.getBalance();
		
		bank.transferBetweenAccounts(account2, account3, 1000);
		
		Assert.assertEquals(balance2 - 1000, account2.getBalance());
		
		Assert.assertEquals(balance3 + 1000, account3.getBalance());
		
		
		
	}

	@Test
	void testRetreiveAll() {
		
		bank.addNewAccount(account1);
		bank.addNewAccount(account2);
		bank.addNewAccount(account3);
	
		Assert.assertEquals(3, bank.retreiveAll().size());
	
	}

	@Test
	void testsearchByAccount() {
		
		int id = account4.getAccountId();
		bank.addNewAccount(account1);
		bank.addNewAccount(account2);
		bank.addNewAccount(account3);
		bank.addNewAccount(account4);
		bank.addNewAccount(account5);
		
		Assert.assertEquals(id, bank.searchByAccount(account4).getAccountId());

		
		
		
		
	}

	@Test
	void testModAccount() {
		
		String  testName = "testname6";
		bank.addNewAccount(account1);
		bank.addNewAccount(account2);
		bank.addNewAccount(account3);
		bank.addNewAccount(account4);
		bank.addNewAccount(account5);
		
		Assert.assertEquals(testName, bank.modAccount(account5, testName).getAccountName());
		
		
	}

	@Test
	void testDelAccount() {
		
		bank.addNewAccount(account1);
		bank.addNewAccount(account2);
		bank.addNewAccount(account3);
		bank.addNewAccount(account4);
		bank.addNewAccount(account5);
		
		int count = bank.accounts.size();
		
		Assert.assertEquals(count-1, bank.delAccount(account5).size());
		
		
		
	}

}
