package array;

import java.util.Locale;
import java.util.Scanner;

import entity.Produto;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n = 3;
		Produto[] vect = new Produto[n];
		
		System.out.println("Input: ");
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o nome do " + (i+1) + "º produto:");
			String name = scan.next()+scan.nextLine();
			System.out.println("Digite o preço do " + (i+1) + "º produto: ");
			double price = scan.nextDouble();
			
			vect[i] = new Produto(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum/n;
		System.out.printf("Média dos preços: R$ %.2f%n", avg);
		
		scan.close();
	}

}
