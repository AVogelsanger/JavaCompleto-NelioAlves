package array;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n = 3;
		
		double[] heigth = new double[n];
		
		System.out.println("Input: ");
		for (int i = 0; i < heigth.length; i++) {
			heigth[i] = scan.nextDouble();
		}
		
		double total = 0.0;
		for (int i = 0; i < heigth.length; i++) {
			
			total += heigth[i]; 
			 
		}
		
		double average = total / n;
		
		System.out.printf("AVERAGE HEIGHT = %.2f%n", average);
		
		scan.close();
	}

}
