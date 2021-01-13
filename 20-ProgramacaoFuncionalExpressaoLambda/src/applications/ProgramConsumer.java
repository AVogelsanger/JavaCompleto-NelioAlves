package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.Product;

public class ProgramConsumer {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		/* Para aumentar em 10% eu fiz essa coisa feia
		double sum = 0;
		
		for (Product p : list) {
			sum = p.getPrice() + (p.getPrice() * 10/100);
			
			System.out.println(p.getName() + " - R$"+sum);
		}
		*/
		// Implementação da interface
		//list.forEach(new PriceUpdate());
		
		// Reference method com método estático
		//list.forEach(Product::staticPriceUpdate);
		
		// Reference method com método não estático
		//list.forEach(Product::nonStaticPriceUpdate);
		
		//Expressão Lambda declarada
		//Consumer<Product> cons = p -> p.setPrice(p.getPrice() + (p.getPrice()*10/100));
		//list.forEach(cons);
		
		// Expressão lambda inline
		list.forEach(p -> p.setPrice(p.getPrice() + (p.getPrice()*10/100)));
		list.forEach(System.out::println);
	}

}
