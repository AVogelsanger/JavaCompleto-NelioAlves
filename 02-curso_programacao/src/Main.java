import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		
		System.out.println("Hello World!");
		System.out.println("valor da vari�vel 'y':" + y);
		System.out.println("valor da vari�vel 'x':" + x);
		System.out.printf("%.2f%n", x); // printf uso da v�rgula inv�s do +
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		System.out.println("Resultado".toUpperCase() + "= " + x + " m�.");
		
		System.out.printf("RESULTADO = %.2f m�%n", x);
		
		String nome = "Hermenegildo";
		int idade = 37;
		double renda = 2500;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f %n", nome, idade, renda);

	}

}
