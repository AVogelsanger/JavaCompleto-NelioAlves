import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		
		System.out.println("Hello World!");
		System.out.println("valor da variável 'y':" + y);
		System.out.println("valor da variável 'x':" + x);
		System.out.printf("%.2f%n", x); // printf uso da vírgula invés do +
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		System.out.println("Resultado".toUpperCase() + "= " + x + " m².");
		
		System.out.printf("RESULTADO = %.2f m²%n", x);
		
		String nome = "Hermenegildo";
		int idade = 37;
		double renda = 2500;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f %n", nome, idade, renda);

	}

}
