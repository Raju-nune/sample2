package com.day02p01;

public class LowBalanceException extends Exception {
	public LowBalanceException() {
        super("Balance is below the minimum required balance.");
    }
}
