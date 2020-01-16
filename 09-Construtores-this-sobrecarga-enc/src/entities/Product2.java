package entities;

public class Product2 {
	private String name;
	private double price;
	private int quantity;
		
	public Product2(String name, double price, int quantity) {
		//super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product2(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

//	n�o utilizado pra proteger o obj produto de altera��es inconsistentes na quantidade dele.
//	Ele s� pode ser alterado por meio das opera��es addProducts e removeProducts	
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}

	//metodos
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}	
}
