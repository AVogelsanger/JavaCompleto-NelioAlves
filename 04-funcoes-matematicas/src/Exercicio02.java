import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double raio, area;
		int x = 0;

		do {

			System.out.print("Entrada: ");
			raio = scan.nextDouble();

			area = 3.14159 * Math.pow(raio, 2.0);

			System.out.printf("Saída: %.4f %n \n", area);

			System.out.print("digite 1(um) p/ realizar novo calculo ou 0(zero) para finalizar: ");
			x = scan.nextInt();
		} while (x != 0);

		System.out.println("Game over");
		scan.close();
	}

}
