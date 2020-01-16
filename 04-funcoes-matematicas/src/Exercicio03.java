import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = 0;
		int diferenca;

		int a, b, c, d;

		do {

			System.out.println("Entrada: ");
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			d = scan.nextInt();

			diferenca = a * b - c * d;
			System.out.println("DIFERENÇA = " + diferenca);

			System.out.print("digite 1(um) p/ realizar novo calculo ou 0(zero) para finalizar: ");
			x = scan.nextInt();
		} while (x != 0);

		scan.close();
	}

}
