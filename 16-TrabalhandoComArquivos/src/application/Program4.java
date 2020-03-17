package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {

	public static void main(String[] args) {
		
		String[] lines = {"Good morning", "Good Afternoon", "Good nigth"};

		String path = "C:\\Eclipse\\JavaComp2019-NelioAlves\\out.txt";
		
		// criar (BufferedWriter bw = new BufferedWriter(new FileWriter(path)))
		// recriar (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true)))
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			  e.printStackTrace();
		}
	}

}
