package com.collabera.facade;

public class FundsCheck {
	
	private double cashInAccount = 1000.00;
	public double getCashInAccount() {
		return cashInAccount;
	}
	public void decreaseCashInAccount(double cashWithdrawn) {
		cashInAccount -= cashWithdrawn;
	}
	public void increaseCashInAccount(double cashDeposited) {
		cashInAccount += cashDeposited;
	}
	public boolean haveEnoughMoney(double cashToWithdrawl) {
		if(cashToWithdrawl > getCashInAccount()) {
			System.out.println("You dont have enough money");
			System.out.println("Current balance: " + getCashInAccount());
			return false;
		}else {
			decreaseCashInAccount(cashToWithdrawl);
			System.out.println("Withdrawl Complete. Current Balance is: " + getCashInAccount());
			return true;
		}
	}

	public void makeDeposit(double cashToDeposit) {
		increaseCashInAccount(cashToDeposit);
		System.out.println("Deposit complete. Current balance: " + getCashInAccount());
	}
}
