package Assignment5;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter initial balance: ");
	        double initialBalance = scanner.nextDouble();
	        System.out.print("Enter withdrawal limit: ");
	        double withdrawalLimit = scanner.nextDouble();

	        SavingAccount account = new SavingAccount(initialBalance, withdrawalLimit);

	        boolean exit = false;
	        while (!exit) {
	            System.out.println("\n1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:  
	                    System.out.print("Enter deposit amount: ");
	                    double depositAmount = scanner.nextDouble();
	                    account.deposit(depositAmount);
	                    break;

	                case 2: 
	                    System.out.print("Enter withdrawal amount: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    account.withdraw(withdrawAmount);
	                    break;

	                case 3: 
	                    System.out.println("Current balance: " + account.getBalance());
	                    break;

	                case 4: 
	                    exit = true;
	                    break;

	                default:
	                    System.out.println("Invalid option");
	            }
	        }
	        scanner.close();
	    }
}
