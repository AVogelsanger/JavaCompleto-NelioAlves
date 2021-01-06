package applications;

import java.util.ArrayList;
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
		
		
		/*1 exemplo de uma formar de fazer
		Comparator<Product> comparator = new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};*/
		
		/*2 Usando uma função anônima com lambda (arrow function);
		Comparator<Product> comparator = (p1,p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};*/
		
		/*3 Usando uma função de dois argumentos do tipo function
		Comparator<Product> comparator = (p1,p2) -> p1.getName()
													.toUpperCase()
													.compareTo(
															p2.getName()
															.toUpperCase());
		
		list.sort(comparator);
		*/
		
		// Expressão lambda corresponde a uma função anônima de primeira classe;
		// 4 Usando uma expressão lambda (função anônima) como argumento;
		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (Product product : list) {
			System.out.println(product);
		}
		
		scan.close();
	}

}
