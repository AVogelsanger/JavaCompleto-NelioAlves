package br.com.nelio.para;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int x = 0, in = 0, out = 0;
		
		for (int i = 1; i <= n; i++) {
			
			x = scan.nextInt();
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}

		}
		
		System.out.println("Saída");
		System.out.println("in: " + in);
		System.out.println("out: " + out);
		
		scan.close();
	}

}
