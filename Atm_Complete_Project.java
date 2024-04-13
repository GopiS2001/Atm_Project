package com.project_atm;
import java.util.*;

public class Atm_Complete_Project {

	public static void main(String[] args) {
		
		int pin = 1243;
		int balance = 10000;
		int AddAmount = 0;
		int TakeAmount = 0;
		
		String name;
		Scanner scanner = new Scanner(System.in);
		
		// we have to take an input by an user
		System.out.println("Enter Your Pin Number : ");
		
		int password = scanner.nextInt();
		
		// code arrangements shift+alt+f
		
		if(password == pin) {
			System.out.println("Enter Your Name : ");
			name = scanner.next();
			System.out.println("Welcome " + name);
			
			while(true) {
				System.out.println("Press 1 to check your balance: ");
				System.out.println("Press 2 to add amount: ");
				System.out.println("Press 3 to take amount: ");
				System.out.println("Press 4 to take receipt: ");
				System.out.println("Press 5 to EXIT.");
				
				int opt = scanner.nextInt();
				switch(opt) {
				case 1:
					System.out.println("Your current balance is " + balance);
					break;
				case 2:
					System.out.println("How much amount did you want to ADD to your account: ");
					AddAmount = scanner.nextInt();
					System.out.println("Successfully Credited");
					balance = AddAmount + balance;
					break;
				case 3:
					System.out.println("How much amount did you want to take: ");
					TakeAmount = scanner.nextInt();
					if(TakeAmount > balance) {
						System.out.println("your balance is insufficient");
						System.out.println("try less than your available balance: ");
					}
					else {
						System.out.println("Successful Taken");
						balance = balance - TakeAmount;
					}
					break;
				case 4:
					System.out.println("Welcome to All in one Mini ATM");
					System.out.println("Available balance is " + balance);
					System.out.println("Amount Deposited " + AddAmount);
					System.out.println("Amount Taken" +  TakeAmount);
					System.out.println("Thanks for Coming");
					break;
					default:
						System.out.println("Exiting");
						break;
				}
				if(opt == 5) {
					System.out.println("Thank You");
					break;
				}
			}
		}
		else {
			System.out.println("Wrong Pin Number");
		}
		

	}

}
