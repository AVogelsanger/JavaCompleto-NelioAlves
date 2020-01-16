import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um numero de 0(zero) à 100(cem): ");
		double num = scan.nextDouble();
		
		
		System.out.println("SAÍDA: ");
		if (num < 0 || num > 100) {
			System.out.println("Fora do Intervalo.");
		} else if (num <= 25.0) {
			System.out.println("Intervalo: (0, 25).");
		} else if (num <= 50.0) {
			System.out.println("Intervalo: (25, 50).");
		} else if (num <= 75.0) {
			System.out.println("Intervalo: (50, 75).");
		} else {
			System.out.println("Intervalo: (75, 100).");
		}		
		
		scan.close();
	}

}
