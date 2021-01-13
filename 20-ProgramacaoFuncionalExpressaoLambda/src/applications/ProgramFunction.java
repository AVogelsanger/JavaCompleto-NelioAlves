package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Product;

public class ProgramFunction {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// Expressão lambda declarada
		//Function<Product, String> func = p -> p.getName().toUpperCase();
		
		
		
     // Função map: pega uma coleção de valores e 
		// aplica a cada item de valores da coleção o método da instância invocada 
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
												// Expressão lambda inline 	
		names.forEach(System.out::println);
	}

}
