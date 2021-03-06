package array;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int m = scan.nextInt();
		int n = scan.nextInt();
		
		int[][] mat = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = scan.nextInt();
			}
		}
		
		System.out.print("Enter with the oc: ");
		int oc = scan.nextInt();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == oc) {
					System.out.println("Position: " + i + ", " + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < n-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < m-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}		
		
		scan.close();
	}

}
