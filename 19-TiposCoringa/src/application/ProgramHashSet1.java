package application;

import java.util.HashSet;
import java.util.Set;

public class ProgramHashSet1 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		set.removeIf(x -> x.charAt(0) == 'T');
		
		for (String	p : set) {
			System.out.println(p);
		}
	}

}
