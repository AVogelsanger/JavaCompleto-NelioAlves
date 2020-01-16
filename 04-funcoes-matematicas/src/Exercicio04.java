import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numberEmp, x, hours;
		double salHour, salary;

		System.out.println("Program of salary of employee");

		do {

			System.out.println("Entrada: ");
			System.out.print("number Employee: ");
			numberEmp = scan.nextInt();
			System.out.print("hours: ");
			hours = scan.nextInt();
			System.out.print("Salary per hour: ");
			salHour = scan.nextDouble();

			salary = salHour * hours;

			System.out.println("SAÍDA: ");
			System.out.println("NUMBER = " + numberEmp);
			System.out.printf("SALARY: US$ %.2f %n \n", salary);

			System.out.print("digite 1(um) p/ realizar novo calculo ou 0(zero) para finalizar: ");
			x = scan.nextInt();
		} while (x != 0);

		System.out.println("End.");
		scan.close();
	}

}
