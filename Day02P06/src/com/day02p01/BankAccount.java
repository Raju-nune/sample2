package com.day02p01;

public class BankAccount {
	private int accNo;
    private String custName;
    private String accType;
    private float balance;

    public BankAccount(int accNo, String custName, String accType, float balance) throws NegativeAmountException, LowBalanceException {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        
        if (balance < 0) {
            throw new NegativeAmountException();
        }
        
        if (accType.equals("Saving") && balance < 1000) {
            throw new LowBalanceException();
        }
        
        if (accType.equals("Current") && balance < 5000) {
            throw new LowBalanceException();
        }
        
        this.balance = balance;
    }

    public void deposit(float amt) throws NegativeAmountException {
        if (amt < 0) {
            throw new NegativeAmountException();
        }
        balance += amt;
    }

    public float getBalance() throws LowBalanceException {
        if (balance < 1000 && accType.equals("Saving")) {
            throw new LowBalanceException();
        }
        
        if (balance < 5000 && accType.equals("Current")) {
            throw new LowBalanceException();
        }
        
        return balance;
    }
}

