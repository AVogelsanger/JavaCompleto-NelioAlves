package applicationStudent;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Student st = new Student();
		
		System.out.println("Enter: ");
		st.name = scan.nextLine();
		st.grade1 = scan.nextDouble();
		st.grade2 = scan.nextDouble();
		st.grade3 = scan.nextDouble();
		
		
		System.out.println("Out: ");
		System.out.println("FINAL GRADE: " + st.finalGrade());
		
		if (st.finalGrade() < 60.00) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", st.missingPoints());
		}else {
			System.out.println("PASS");
		}
		
		scan.close();
	}

}
