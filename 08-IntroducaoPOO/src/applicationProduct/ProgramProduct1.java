package applicationProduct;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramProduct1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Product prod = new Product();
		
		System.out.println("Enter product data:");
		prod.name = scan.nextLine();
		prod.price = scan.nextDouble();
		prod.quantity = scan.nextInt();
				
		System.out.println(prod);
		System.out.println();
		
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = scan.nextInt();
		prod.addProducts(quantity);
		
		System.out.println("Update " + prod);
		System.out.println();
		
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = scan.nextInt();
		prod.removeProducts(quantity);
		
		System.out.println("Update " + prod);
		System.out.println();
		
		scan.close();
	}

}
