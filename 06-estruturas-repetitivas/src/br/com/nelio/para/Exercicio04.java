package br.com.nelio.para;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double res = 0;
		int v1 = 0, v2 = 0;
		
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			v1 = scan.nextInt();
			v2 = scan.nextInt();
			
			res = (double) v1 / v2;
			
			if (v2 == 0) {
				System.out.println("divisão impossível");
			} else {
				System.out.printf("%.1f%n", res);
			}
			
			
		}
		
		scan.close();
	}

}
