package br.com.nelio.enquanto;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int soma = 0;
		
		System.out.println("Entrada: ");
		int x = scan.nextInt();
		
		while(x != 0) {
			soma += x;
			x = scan.nextInt();
		}

		System.out.println("Saída: ");
		System.out.println(soma);
		
		scan.close();
	}

}
