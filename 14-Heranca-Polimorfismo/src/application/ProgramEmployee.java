package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class ProgramEmployee {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Enter the number of employees: ");
		int n = scan.nextInt();
		
		List<Employee> employees = new ArrayList<Employee>();
		
		for (int i = 1; i <= n; i++) {

			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)?");
			char outsourced = scan.next().charAt(0);
			
				if (outsourced == 'y'|| outsourced =='Y') {
					
					System.out.print("Name: ");
					String name = scan.next() + scan.nextLine();
					System.out.print("Hours: ");
					int hours = scan.nextInt();
					System.out.print("Value per hour: ");
					double valuePerHour = scan.nextDouble();
					System.out.print("Additional Charge: ");
					double addCharge = scan.nextDouble();
					
					employees.add(new OutsourceEmployee(name, hours, valuePerHour, addCharge));
					
				} else {
					
					System.out.print("Name: ");
					String name = scan.next() + scan.nextLine();
					System.out.print("Hours: ");
					int hours = scan.nextInt();
					System.out.print("Value per hour: ");
					double valuePerHour = scan.nextDouble();
					
					employees.add(new Employee(name, hours, valuePerHour));
				}
			
		
		}
	
		System.out.println("PAYMENTS:");
		for (Employee e : employees) {
			System.out.println(e.toString());
		}
		

		
		
		scan.close();
	}

}
