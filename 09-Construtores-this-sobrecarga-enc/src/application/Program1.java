package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product1;

public class Program1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product1 product1 = new Product1(name, price, quantity);
		
		System.out.println();
		System.out.println("Product data: " + product1);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product1.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product1);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product1.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product1);
		
		sc.close();
	}
}