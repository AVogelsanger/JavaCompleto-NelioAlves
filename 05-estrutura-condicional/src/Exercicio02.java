import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, x = 0;

		do {
			
			System.out.print("Entrada: ");
			num = scan.nextInt();
			
			System.out.print("Sa�da: ");
			if (num % 2 == 0) {
				System.out.println("PAR");
			} else {
				System.out.println("�MPAR");
			}

			System.out.print("digite 1(um) p/ realizar novo calculo, ou 0(zero) para finalizar: ");
			x = scan.nextInt();
			}while(x != 0);
			
			
			System.out.println("FIM");
			scan.close();
		
		
		scan.close();
	}

}
