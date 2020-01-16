import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int codePart1, codePart2, numbersPart1, numbersPart2;
		double valuePart1, valuePart2, totalPay = 0;

		System.out.println("IN: ");
		System.out.print("Digite os dados da 1º peça: ");
		codePart1 = scan.nextInt();
		numbersPart1 = scan.nextInt();
		valuePart1 = scan.nextDouble();

		System.out.print("Digite os dados da 2º peça: ");
		codePart2 = scan.nextInt();
		numbersPart2 = scan.nextInt();
		valuePart2 = scan.nextDouble();

		totalPay = (valuePart1 * numbersPart1) + (valuePart2 * numbersPart2);

		System.out.println("EXIT: ");
		System.out.printf("Value to pay US$ %.2f %n ", totalPay);

		scan.close();
	}

}
