package util;

import java.util.function.Consumer;

import model.Product;

public class PriceUpdate implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() + p.getPrice() * 10/100);
	}

}
