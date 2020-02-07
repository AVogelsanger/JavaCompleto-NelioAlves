package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class ProgramAccount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = scan.nextInt();
			System.out.print("Holder: ");
			String holder = scan.next() + scan.nextLine();
			System.out.print("Initial balance: ");
			double balance = scan.nextDouble();
			System.out.print("Withdraw limit: ");
			double withDrawLimit = scan.nextDouble();
			
			Account acc = new Account(number, holder, balance, withDrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = scan.nextDouble();
			
			 acc.withDraw(amount);
			
			System.out.println("New Balance: U$" + acc.getBalance());
			System.out.println();
		} catch (DomainException e) {
			System.out.println("Withdraw error:" + e.getMessage());
		}  catch (RuntimeException e) {
			System.out.println("Rolou!");
		}
		
		
		scan.close();
	}

}
