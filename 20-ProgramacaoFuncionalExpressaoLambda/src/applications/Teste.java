package applications;

import java.util.Arrays;

public class Teste {

	public static void main(String[] args) {
		
		String[ ] original = { "A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3" };
		
		System.out.println(Arrays.deepToString(transformaArray(original)));
			
	}
	
	public static String[][] transformaArray(String[] original){
		
		int position = 0;
		int size = 3;
		
		String[][] resultado = new String[size][size];
		
		for (int row = 0; row < size; row++) {		
			for (int item = 0; item < size; item++) {
				resultado[row][item] = original[position];
				position++;				
			}
		}
		
		return resultado;
	}

}
