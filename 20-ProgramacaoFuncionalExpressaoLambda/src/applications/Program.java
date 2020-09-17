package applications;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import model.Product;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		//list.sort();
		
		for (Product product : list) {
			System.out.println(product);
		}
		
		scan.close();
	}

}
