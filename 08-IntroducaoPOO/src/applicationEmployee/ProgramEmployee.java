package applicationEmployee;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Employee emp = new Employee();
		
		System.out.println("Name: ");
		emp.name = scan.nextLine();
		System.out.println("Gross Salary: ");
		emp.grossSalary = scan.nextDouble();
		System.out.println("Tax: ");
		emp.tax = scan.nextDouble();
		
		System.out.println("Employee: " + emp);
		
		System.out.println();
		System.out.println("Which percentage to encrease salary? ");
		double perc = scan.nextDouble();
		
		emp.increaseSalary(perc);
		
		System.out.println("Update data Employee: " + emp);
		
		
		scan.close();
	}

}
