package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class ProgramProduct {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> products = new ArrayList<Product>();

		System.out.print("Enter the number of products: ");
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char opcao = scan.next().charAt(0);
			
			System.out.print("Name: ");
			String name = scan.next() + scan.nextLine();
			System.out.print("Price: U$");
			double price = scan.nextDouble();
			
			if (opcao == 'i' || opcao == 'I') {
				System.out.print("Customs fee: ");
				double customsFee = scan.nextDouble();
				
				products.add(new ImportedProduct(name, price, customsFee));
				
			} else if (opcao == 'u' || opcao == 'U') {
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				Date manuFactureDate = sdf.parse(scan.next());
				
				products.add(new UsedProduct(name, price, manuFactureDate));
				
			} else {
				
				products.add(new Product(name, price));
				
			}
		}
		
		
		System.out.println("PRICE TAGS:");
		for (Product p : products) {
			System.out.println(p.priceTag());
		}
		
		
		scan.close();
	}

}
