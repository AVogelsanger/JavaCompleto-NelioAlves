import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num, x = 0;

		do {

			System.out.print("Entrada: ");
			num = scan.nextInt();

			System.out.print("Saída: ");
			if (num < 0) {
				System.out.println("NEGATIVO");
			} else {
				System.out.println("NÃO NEGATIVO");
			}

			System.out.print("digite 1(um) p/ realizar novo calculo, ou 0(zero) para finalizar: ");
			x = scan.nextInt();
		} while (x != 0);

		System.out.println("FIM");
		scan.close();
	}

}
