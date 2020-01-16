package br.com.nelio.enquanto;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();

		while(x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}		
			if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
		}

		scan.close();
	}

}
