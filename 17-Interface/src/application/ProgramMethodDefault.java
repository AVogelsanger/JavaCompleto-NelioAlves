package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.IInterestService;
import model.entities.UsaInterestService;

public class ProgramMethodDefault {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Amount: U$");
		double amount = scan.nextDouble();
		System.out.print("Months: ");
		int months = scan.nextInt();
		
		IInterestService is = new UsaInterestService(1.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		
		scan.close();
	}
}
