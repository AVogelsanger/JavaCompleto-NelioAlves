package applications;

import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ProgramPredicate {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("HD Case", 80.90));

		
		// Interface funcional - tem apenas um método abstrado a ser implementado.
		// 5 formas de fazer
		//list.removeIf(new ProductPredicate());
		
		// method reference - com método estático
		//list.removeIf(Product::staticProductPredicate);
		
		// method reference - com método não estático
		// list.removeIf(Product::nonStaticProductPredicate);
		
		// Expressão Lambada declarada
		// Predicate<Product> pred = p -> p.getPrice() >= 100;
		
		// Expressão lambda inLine
		list.removeIf(p -> p.getPrice() >= 100);
		
		for (Product product : list) {
			System.out.println(product);
		}
		
	}

}
