package array;

import java.util.Scanner;

import entity.Estudante;

public class ExercicioFixaxao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Estudante[] vect = new Estudante[10];
		
		System.out.print("How many rooms will be rented?");
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			String name = scan.next()+scan.nextLine();
			System.out.print("e-mail: ");
			String email = scan.next()+scan.nextLine();
			System.out.print("Room: ");
			int room = scan.nextInt();
			
			vect[room] = new Estudante(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ":" + vect[i]);
			}
		}
		
		scan.close();
	}

}
