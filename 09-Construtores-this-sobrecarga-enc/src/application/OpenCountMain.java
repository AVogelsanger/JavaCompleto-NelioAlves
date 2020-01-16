package application;

import java.util.Locale;
import java.util.Scanner;

import Bank.BankAccount;

public class OpenCountMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		BankAccount client1 = null;
		
		double valueDep = 0.0;
				
		System.out.print("Enter account number: ");
		int num = scan.nextInt();
		
		System.out.print("Enter account holder: ");
		String name = scan.next()+scan.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		String depositOption = scan.next();		
	
		if (depositOption.equalsIgnoreCase("y")) {
			System.out.print("Enter initial deposit value: US$");
			valueDep = scan.nextDouble();
			client1 = new BankAccount(num, name, valueDep);
		} else if (depositOption.equalsIgnoreCase("n")) {
			client1 = new BankAccount(num, name);
		}
		//BankAccount client1 = new BankAccount(num, name, valueDep);
		
		System.out.println("\nAccount data: ");
		System.out.println(client1);
		
		System.out.print("Enter a new deposit value: US$: ");
		valueDep = scan.nextDouble();
		client1.deposit(valueDep);
		System.out.println("\nUpdated account data: ");
		System.out.println(client1);
		
		
		System.out.print("Enter a withdraw value: ");
		double valueWithDraw = scan.nextDouble();
		client1.withDraw(valueWithDraw);
		System.out.println("\nUpdated account data: ");
		System.out.println(client1);
		
		
		scan.close();
	}

}
