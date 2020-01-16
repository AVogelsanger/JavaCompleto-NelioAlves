package br.com.nelio.para;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double v1 = 0.0, v2 = 0.0, v3 = 0.0, media = 0.0;
		int n = scan.nextInt();
		
		System.out.println("Entrada: ");
		for (int i = 0; i < n; i++) {
			v1 = scan.nextDouble();
			v2 = scan.nextDouble();
			v3 = scan.nextDouble();
			
			media = (v1 * 2.0  + v2 * 3.0 + v3 * 5.0) / 10.0;
		}
		
		System.out.printf("%.1f%n", media);
		
		
		scan.close();
	}

}
