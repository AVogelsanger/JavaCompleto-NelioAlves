package model;

public class Product {
	
	private String name;
	private Double price;
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static String staticUpperCaseNames(Product p) {
		return p.getName().toUpperCase();
	}
	
	public String nonStaticUpperCaseNames() {
		return name.toUpperCase();
	}
		
	/**
	 * Métodos estáticos trabalho com os argumentos que vc passa pra ele 
	 * public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100;
	}
	 * 
	 * public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() + p.getPrice() * 10/100);
	}
	
	
	 não estático - trabalho com o próprio objeto da instância (usa o atributo da classe);
	public boolean nonStaticProductPredicate() {
		return price >= 100;
	}
	
	public void nonStaticPriceUpdate() {
		price = price + (price * 10/100);
	}
	 *
	 */
	
	@Override
	public String toString() {
		return  name + ", R$" + String.format("%.2f", price);
	}

}
