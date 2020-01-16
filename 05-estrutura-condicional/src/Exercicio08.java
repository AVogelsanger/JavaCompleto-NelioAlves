import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double imposto = 0.0;

		System.out.print("Digite a renda, R$ ");
		double renda = scan.nextDouble();

		if (renda <= 2000.00) {
			imposto = 0.0;
		} else if (renda <= 3000.00) {
			imposto = (renda - 2000.00) * 0.08;
		} else if (renda <= 4500.00) {
			imposto = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
		} else {
			imposto = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}


		if (imposto == 0.0) { 
			System.out.println("Isento"); 
		} else {
			System.out.printf("R$ %.2f%n", imposto); 
		}


		scan.close();
	}

}
