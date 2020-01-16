package br.com.nelio.para;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int fat = 1;
		int n = scan.nextInt();
		
		for (int i = n; i > 1; i--) {
			fat *= i;
			System.out.print(" x " + i);
		}
		
		System.out.println("\nO fatorial de " + n + " é " + fat);
		
		scan.close();
	}

}
