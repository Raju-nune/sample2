package com.day02p01;

import java.util.Scanner;

public class TestBankAccount {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        try {
	            System.out.println("Enter account number:");
	            int accNo = scanner.nextInt();
	            
	            System.out.println("Enter customer name:");
	            String custName = scanner.next();
	            
	            System.out.println("Enter account type (Saving or Current):");
	            String accType = scanner.next();
	            
	            float balance = scanner.nextFloat();
	            
	            BankAccount account = new BankAccount(accNo, custName, accType, balance);
	         
	        } catch (NegativeAmountException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (LowBalanceException e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }
	}
