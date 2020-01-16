package br.com.nelio.para;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entrada: ");
		int n = scan.nextInt();
				
		System.out.println("Saída: ");
		for (int i = 1; i <= n; i++) {
			
			int first = i;
			int second = i * i;
			int third = i * i * i;
			
			System.out.printf("%d %d %d%n", first, second, third);
		}
		
		
		
		scan.close();
	}

}
