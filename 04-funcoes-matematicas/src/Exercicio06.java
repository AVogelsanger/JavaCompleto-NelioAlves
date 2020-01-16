import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double A, B, C;
		int x = 0;
		
		do {
		
		System.out.println("ENTRADA: ");
		A = scan.nextDouble();
		B = scan.nextDouble();
		C = scan.nextDouble();
				
		double triangulo = A * C / 2; 
		double areaCirc = Math.PI * Math.pow(C, 2);
		double trapezio = ((A+B) * C) / 2;
		double quadrado = Math.pow(B, 2);
		double retangulo = A * B;
				
		System.out.printf("A) TRIÂNGULO: %.3f %n", triangulo);
		System.out.printf("B) CÍRCULO: %.3f %n", areaCirc);
		System.out.printf("C) TRAPÉZIO: %.3f %n", trapezio);
		System.out.printf("D) QUADRADO: %.3f %n", quadrado);
		System.out.printf("E) RETÂNGULO: %.3f %n", retangulo);

		System.out.print("digite 1(um) p/ realizar novo calculo, ou 0(zero) para finalizar: ");
		x = scan.nextInt();
		}while(x != 0);
		
		
		System.out.println("FIM");
		scan.close();
	}

}
