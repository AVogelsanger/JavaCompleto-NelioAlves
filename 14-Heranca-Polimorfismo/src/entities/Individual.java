package entities;

public class Individual extends TaxPayer {

	private Double healthSpending;
	
	public Individual() {
		
	}

	public Individual(String name, Double anualIncome, Double healthSpending) {
		super(name, anualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public double tax() {
		
		double tax = 0.0;
		if (getAnualIncome() < 20000.00) {
			tax = (getAnualIncome() * 0.15) - (healthSpending * 0.50);
		} else {
			tax = (getAnualIncome() * 0.25) - (healthSpending * 0.50);
		}
		
		return tax;
	}
	
}
