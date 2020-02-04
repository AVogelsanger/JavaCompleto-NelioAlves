package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;


public class ProgramTax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of tax payers: ");
		int n = scan.nextInt();
		
		List<TaxPayer> list = new ArrayList<TaxPayer>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer # " + i + " data:");
			System.out.print("Individual or company (i/c)?");
			char ch = scan.next().charAt(0);
			System.out.print("Name: ");
			String name = scan.next() + scan.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = scan.nextDouble();
			
				if (ch == 'i'|| ch == 'I') {
					System.out.print("Health expenditures: ");
					double healthExpenditures = scan.nextDouble();
					
					list.add(new Individual(name, anualIncome, healthExpenditures));
				}
				
				if (ch == 'c' || ch == 'C') {
					System.out.print("Number of employees: ");
					int numberEmployees = scan.nextInt();
					
					list.add(new Company(name, anualIncome, numberEmployees));
				}
		}
		
		
		double total = 0.0;
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer taxPayer : list) {
			
			System.out.println(taxPayer.getName() + ": U$" + String.format("%.2f", taxPayer.tax()));
			
			total += taxPayer.tax();
			
		}
		
		
		System.out.println();
		System.out.println("TOTAL TAXES: U$" + total);
		
		scan.close();
	}

}
