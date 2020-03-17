package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entity.Product;

public class ExercProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Product> products = new ArrayList<Product>();

		System.out.print("Enter a file path: ");
		String strPath = scan.nextLine();
		
		File sourceFile = new File(strPath);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
			
			String itemCsv = br.readLine();
			
			while (itemCsv != null) {
				
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double value = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				products.add(new Product(name, value, quantity));				
				itemCsv = br.readLine();
				
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr, true))) {
				
				for (Product product : products) {
					bw.write(product.getName() + "," + String.format("%.2f", product.total()));
				}
				
				System.out.println(targetFileStr + " CREATED!");
				
			} catch (IOException e) {
				System.out.println("ERROR writing file: " + e.getMessage());
			}
			
			
		} catch (IOException e) {
			System.out.println("ERROR reading file: " + e.getMessage());
		}
		
		
		scan.close();
	}

}
