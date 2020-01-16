import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0;

		do {

			int horaIncial, horaFinal, duracao = 0, dia = 24;

			System.out.print("Entrada: ");
			horaIncial = scan.nextInt();
			horaFinal = scan.nextInt();

			System.out.print("Saída: ");
			if (horaIncial < horaFinal) {
				duracao = horaFinal - horaIncial;
			} else {
				duracao = dia - horaIncial + horaFinal;
			}
			System.out.println("O jogo durou " + duracao + " hora(s).");

			System.out.print("digite 1(um) p/ realizar novo calculo, ou 0(zero) para finalizar: ");
			x = scan.nextInt();
		} while (x != 0);

		System.out.println("FIM");

		scan.close();
	}

}
