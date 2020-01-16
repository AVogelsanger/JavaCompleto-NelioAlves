package applicationMethodStatic;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class ProgramConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("What is the dollar price? US$");
		double dollarPrice = scan.nextDouble();		
		System.out.print("How many dollars will be bought? US$");
		double amount = scan.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		
		System.out.printf("Amount to be paid in reias: R$%.2f", result);
				
		scan.close();
	}

}
