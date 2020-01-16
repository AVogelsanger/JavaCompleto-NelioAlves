package array;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[][] mat = new int[n][n];
		
		System.out.println("INPUT: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Main Diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.println(mat[i][i] + " ");
		}
		
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		
		System.out.println("Negative numbers: " + count);
		scan.close();
	}

}
