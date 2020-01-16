package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entity.Employee;

public class ExercicioList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registred? ");
		int n = scan.nextInt();
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("EMPLOYEE #" + (i+1) + ":");
			System.out.print("Id: ");
			int id = scan.nextInt();
			System.out.print("Name: ");
			String name = scan.next()+scan.nextLine();
			System.out.println("Salary: US$");
			double salary = scan.nextDouble();
			
			list.add(new Employee(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = scan.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double perc = scan.nextDouble();
			emp.increaseSalary(perc);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		scan.close();
	}

}
