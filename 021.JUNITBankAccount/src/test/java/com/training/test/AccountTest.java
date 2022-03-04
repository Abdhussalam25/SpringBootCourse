package com.training.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.training.Account;

import junit.framework.Assert;

class AccountTest {
  
	Account account;
	
	@BeforeEach
	void setUp() throws Exception {
		
		account = new Account("salam",131313,6000);
	}
	
	@Test
	void testAccount() {
		account = new Account("salam",131313,6000);
		
		Assert.assertEquals(account, account);
		
	}

	@Test
	void testDepositAmount() {
	
		int actual = account.depositAmount(100);
		Assert.assertEquals(6000, actual);
		
		//Assert.assertEquals(7000, account.depositAmount(700));				
	}

	@Test
	void testWithDrawAmount() {
		
		boolean actual = account.withDrawAmount(1000);
		
		Assert.assertEquals(true, actual);
		
	}

}
