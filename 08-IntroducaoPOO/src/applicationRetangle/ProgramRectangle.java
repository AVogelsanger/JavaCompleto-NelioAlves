package applicationRetangle;

import java.util.Scanner;

import entities.Rectangle;

public class ProgramRectangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = scan.nextDouble();
		rectangle.height = scan.nextDouble();
		
		System.out.println(rectangle);
		
		
		
		
		scan.close();
	}

}
