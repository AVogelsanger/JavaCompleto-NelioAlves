package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product2;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		Product2 product2 = new Product2(name, price);
		
		
		product2.setName("Computer");
		System.out.println("Update name: " + product2.getName());
		product2.setPrice(1200);
		System.out.println("Update price: US$" + product2.getPrice());
		
		
		System.out.println();
		System.out.println("Product data: " + product2);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product2.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product2);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product2.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product2);
		
		sc.close();
	}

}
