package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enums.Color;

public class ProgramShape {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of shape: ");
		int n = scan.nextInt();
		
		List<Shape> shapes = new ArrayList<Shape>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape # "+ i +" data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = scan.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(scan.next());
			
			if (ch == 'r' || ch == 'R') {
				System.out.print("Width: ");
				double width = scan.nextDouble();
				
				System.out.print("Height: ");
				double height = scan.nextDouble();
				
				shapes.add(new Rectangle(color, width, height));
			}
			
			if (ch == 'c' || ch == 'C') {
				System.out.print("Radius: ");
				double radius = scan.nextDouble();
				
				shapes.add(new Circle(color, radius));
			}
		
		}
		
		System.out.println("SHAPE AREAS");
		for (Shape shape : shapes) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		
		scan.close();
	}

}
