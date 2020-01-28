package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class ProgramOrder {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = scan.nextLine();
		System.out.print("E-mail: ");
		String email = scan.next();
		System.out.print("Birth date: ");
		Date date = sdf.parse(scan.next());
		
		Client client = new Client(name, email, date);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(scan.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" +i+ " item data:");
			
			System.out.print("Product name: ");
			scan.nextLine();
			String prodName = scan.nextLine();
			
			System.out.print("Product price: ");
			double prodPrice = scan.nextDouble();
						
			Product product = new Product(prodName, prodPrice);
			
			System.out.print("Quantity: ");
			int quantity = scan.nextInt();
			
			OrderItem oi = new OrderItem(quantity, prodPrice, product);
			
			order.addItem(oi);
			
		}
			
		System.out.println("");
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		
		scan.close();
	}

}
