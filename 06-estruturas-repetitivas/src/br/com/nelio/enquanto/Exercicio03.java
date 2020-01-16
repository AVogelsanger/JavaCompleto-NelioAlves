package br.com.nelio.enquanto;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		menu();
		
		int alc = 0, gas = 0, die = 0;
		int tipoCombs = 0;
		
		while(tipoCombs != 4) {
			
			tipoCombs = scan.nextInt();
			
			switch (tipoCombs) {
			case 1:
				alc++;
				break;
			case 2:
				gas++;
				break;
			case 3:
				die++;
				break;
			case 4:
				System.out.println("Sa�da:");
				System.out.println("MUITO OBRIGADO");
				System.out.println("Alcool: " + alc);
				System.out.println("Gasolina: " + gas);
				System.out.println("Diesel: " + die);
				break;	
			default:
				System.out.println("C�digo inv�lido, digite as op��es: [1] alcool, [2] gasolina ou [3] diesel.");
				break;
			}
			
		}

		
		scan.close();
	}

	private static void menu() {
		System.out.println("--- ESCOLHA O COMBUST�VEL ---");
		System.out.println("          [1] �lcool         ");
		System.out.println("         [2] Gasolina		 ");
		System.out.println("          [3] Diesel		 ");
		System.out.println("           [4] Fim			 ");
	}

}
