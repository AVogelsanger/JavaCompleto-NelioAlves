package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {
		
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 900.00));
		set.add(new Product("Notebook", 1200.00));
		set.add(new Product("Tablet", 400.00));
		
		//Product prod = new Product("Notebook", 1200.00);
		
		// System.out.println(set.contains(prod));
		
		for (Product p : set) {
			System.out.println(p);
		}

	}

}
