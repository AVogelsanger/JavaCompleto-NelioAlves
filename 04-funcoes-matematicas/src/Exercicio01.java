import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b, c, d, e, f;

		a = 10;
		b = 30;
		int soma1 = a + b;
		System.out.println("SOMA = " + soma1);

		c = -30;
		d = 10;
		int soma2 = c + d;
		System.out.println("SOMA = " + soma2);

		e = 0;
		f = 0;
		int soma3 = e + f;
		System.out.println("SOMA = " + soma3);

		scan.close();
	}
}
