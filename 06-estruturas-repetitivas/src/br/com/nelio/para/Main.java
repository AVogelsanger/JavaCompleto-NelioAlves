package br.com.nelio.para;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = 0;
		int soma = 0;
		
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			x = scan.nextInt();
			soma += x;
		}
		
		System.out.println(soma);
		
		scan.close();
	}

}
