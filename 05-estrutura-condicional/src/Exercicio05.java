import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("CODIGO  ----  ESPECIFICAÇÃO  ----  PREÇO");
		System.out.println("  1          cachorro quente      R$ 4.00");
		System.out.println("  2            X - Salada         R$ 4.50");
		System.out.println("  3            X - Bacon          R$ 5.00");
		System.out.println("  4          Torrada simples      R$ 2.00");
		System.out.println("  5           Refrigerante        R$ 1.50");

		int item = 0, quant = 0, x = 0;
		double total = 0;

		do {

			System.out.println("Faça seu pedido pelos numeros dos itens:");
			System.out.print("ENTRADA: ");
			item = scan.nextInt();
			quant = scan.nextInt();

			if (item == 1) {
				total = (double) 4.00 * quant;
			} else if (item == 2) {
				total = (double) 4.50 * quant;
			} else if (item == 3) {
				total = (double) 5.00 * quant;
			} else if (item == 4) {
				total = (double) 2.00 * quant;
			} else if (item == 5) {
				total = (double) 1.50 * quant;
			}

			System.out.println("Saída:");
			System.out.printf("TOTAL: R$ %.2f %n", total);

			System.out.println("Deseja realizar outro pedido? 1 para sim e 0 para não");
			x = scan.nextInt();
		} while (x != 0);

		System.out.println("FIM");
		scan.close();
	}

}
