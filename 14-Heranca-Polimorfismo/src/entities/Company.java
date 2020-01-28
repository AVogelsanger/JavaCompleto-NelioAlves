package entities;

public class Company extends TaxPayer {

	private int numberEmployees;

	public Company() {
		
	}
	
	public Company(String name, Double anualIncome, int numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}

	public int getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(int numberEmployees) {
		this.numberEmployees = numberEmployees;
	}


	@Override
	public double tax() {
		
		double tax = 0.0;
		
		if (getAnualIncome() >= 400000.00 && numberEmployees >= 25) {
			tax = getAnualIncome() * 0.14;
		}
		
		return tax;
	}

}
