package br.com.nelio.enquanto;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int senha = scan.nextInt();

		while(senha != 2002) {
			System.out.println("Senha Inválida!");
			senha = scan.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		
		
		scan.close();
	}

}
