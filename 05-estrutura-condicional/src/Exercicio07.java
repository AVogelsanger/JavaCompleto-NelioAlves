import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite os valores: ");
		float x = scan.nextFloat();
		float y = scan.nextFloat();
		
		
		System.out.print("SAÍDA: ");
		if (x == 0.0 && y == 0.0) {
			System.out.print("ORIGEM");
		} else if (x >= 0 && y >= 0) {
			System.out.println("Q1");
		} else if (x <= 0 && y >= 0){
			System.out.println("Q2");
		} else if (x <= 0 && y <= 0) {
			System.out.println("Q3");
		} else if (x >= 0 && y <= 0) {
			System.out.println("Q4");
		} 
		
		
		scan.close();
	}

}
