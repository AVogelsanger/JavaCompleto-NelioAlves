package application;

import device.ComboDevice;
import device.ConcretePrinter;
import device.ConcreteScanner;

public class ProgramScanner {

	public static void main(String[] args) {
		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My letter");
		p.print("My letter");
		
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My e-mail");
		System.out.println("Scan result: " + s.scan());
		
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());
	}

}
