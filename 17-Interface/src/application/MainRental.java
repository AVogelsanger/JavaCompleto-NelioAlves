package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.service.BrazilTaxService;
import model.service.RentalService;

public class MainRental {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter rental data:");
		System.out.print("Car model: ");
		String carModel = scan.nextLine();
		System.out.print("Pickup (dd/MM/yyyy hh:mm): ");
		Date start = sdf.parse(scan.nextLine());
		System.out.print("Return (dd/MM/yyyy hh:mm): ");
		Date finish = sdf.parse(scan.nextLine());
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Enter price per hour: U$");
		double pricePerHour = scan.nextDouble();
		System.out.print("Enter price per day: U$");
		double pricePerDay = scan.nextDouble();
		
		RentalService rs = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
		
		rs.processInvoice(cr);
		
		System.out.println("INVOICE: ");
		System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Basic tax: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Basic Total payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		
		scan.close();
	}

}
