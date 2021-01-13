package service;

import java.util.List;
import java.util.function.Predicate;

import model.Product;

public class ProductService {
	
	// o segundo parâmetro dessa funcção representa um predicado
	// para que a classe não fique "injeçada"
	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		for (Product p : list) {
			if (criteria.test(p)) { // p.getName().charAt(0) == 'T'
				sum += p.getPrice();
			}
		}
		return sum;
	}

}
