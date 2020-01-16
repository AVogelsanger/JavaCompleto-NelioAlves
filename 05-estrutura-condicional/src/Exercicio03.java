import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = 0, A, B;

		do {

			System.out.print("Entrada: ");
			A = scan.nextInt();
			B = scan.nextInt();

			System.out.print("Saída: ");
			if (A % B == 0 || B % A == 0) {
				System.out.println("São Múltiplos");
			} else {
				System.out.println("Não são Múltiplos");
			}

			System.out.print("digite 1(um) p/ realizar novo calculo, ou 0(zero) para finalizar: ");
			x = scan.nextInt();
		} while (x != 0);

		System.out.println("FIM");
		scan.close();

		scan.close();
	}

}
