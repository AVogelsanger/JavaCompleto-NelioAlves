package model.service;

import device.Device;
import device.IPrinter;

public class ConcretePrinter extends Device implements IPrinter{
	
	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);
	}

	@Override
	public void print(String doc) {
		System.out.println("Printing: " + doc);		
	}
	
}
